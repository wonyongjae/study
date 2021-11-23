from account import *
from imap_tools import MailBox
import smtplib
from email.message import EmailMessage

# 최대 선정자 수
max_val = 3
# 지원자 리스트
applicant_list = []

print("[1. 지원자 메일 조회]")
with MailBox("imap.gmail.com", 993).login(EMAIL_ADDRESS, EMAIL_PASSWORD, initial_folder="INBOX") as mailbox:
    # 순번
    index = 1
    # 2021년 11월 13일 이후로 온 메일 조회
    for msg in mailbox.fetch('(SENTSINCE 13-Nov-2021)'): 
        if "파이썬 특강 신청" in msg.subject:
            nickname, phone = msg.text.strip().split("/")
            print("순번 : {}  닉네임 : {}  전화번호 : {}".format(index, nickname, phone))
            applicant_list.append((msg, index, nickname, phone))
            index += 1

# [신청 안내 메일]
# 제목 : 파이썬 특강 안내 [선정]
# 본문 : xx님 축하합니다. 특강 대상자로 선정되었습니다.(선정순번 1번)

# [탈락 안내 메일]
# 제목 : 파이썬 특강 안내 [탈락]
# 본문 : xx님 아쉽게도 탈락입니다. 취소 인원이 발생하는 경우 연락드리겠습니다.(대기순번 1번)

print("[2. 선정/탈락 메일 발송]")
with smtplib.SMTP("smtp.gmail.com", 587) as smtp:
    smtp.ehlo()
    smtp.starttls()
    smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)

    for applicant in applicant_list:
        to_addr = applicant[0].from_ # 수신 메일 주소
        # index = applicant[1]
        # nickname = applicant[2]
        # phone = applicant[3]
        index, nickname, phone = applicant[1:]

        title = None
        content = None

        if index <= max_val:
            title = "파이썬 특강 안내 [선정]"
            content = "{}님 축하합니다. 특강 대상자로 선정되었습니다.(선정순번 {}번)".format(nickname, index)
        else:
            title = "파이썬 특강 안내 [탈락]"
            content = "{}님 아쉽게도 탈락입니다. 취소 인원이 발생하는 경우 연락드리겠습니다.(대기순번 {}번)".format(nickname, index - max_val)

        msg = EmailMessage()
        msg["Subject"] = title
        msg["From"] = EMAIL_ADDRESS
        msg["To"] = to_addr
        msg.set_content(content)
        smtp.send_message(msg)
        print(nickname, "님에게 메일 발송 완료")

