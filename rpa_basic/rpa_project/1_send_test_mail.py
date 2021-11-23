# Project) 파이썬 특가을 진행
# 참여 신청은 이메일을 통해 가능
# 메일 수신 시간 기준으로 선착순 3명 선정
# 아래 조건에 해당하는 메일을 자동으로 조회하여 선정된 사람에겐 선정 안내 메일을,
# 선정되지 못한 사람에겐 대기 번호 안내 메일을 자동으로 발신
# 선정된 3명의 명단을 엑셀 파일로 저장하는 자동화 프로그램 작성

# [신청 메일 양식]
# 제목 : 파이썬 특강 신청 
# 본문 : 닉네임/전화번호 뒤 4자리 (Random)
# (ex) 원용재/1234

# [신청 안내 메일]
# 제목 : 파이썬 특강 안내 [선정]
# 본문 : xx님 축하합니다. 특강 대상자로 선정되었습니다.(선정순번 1번)

# [탈락 안내 메일]
# 제목 : 파이썬 특강 안내 [탈락]
# 본문 : xx님 아쉽게도 탈락입니다. 취소 인원이 발생하는 경우 연락드리겠습니다.(대기순번 1번)

# [선정 명단 엑셀]
# 순번 닉네임 전화번호
# 1   원용재1 1234
# 2   원용재2 2345
# 3   원용재3 3456

import smtplib
from account import *
from email.message import EmailMessage
from random import *

nicknames = ["원용재1","원용재2","원용재3","원용재4","원용재5"]

with smtplib.SMTP("smtp.gmail.com", 587) as smtp:
    smtp.ehlo()
    smtp.starttls()
    smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)

    for nickname in nicknames:
        msg = EmailMessage()
        msg["Subject"] = "파이썬 특강 신청"
        msg["From"] = EMAIL_ADDRESS
        msg["To"] = "dnjsalsl9182@gmail.com"
        
        # content = nickname + "/" + str(randint(1000, 9999)
        content = "/".join([nickname, str(randint(1000, 9999))])
        msg.set_content(content)
        smtp.send_message(msg)

        print(nickname + "가 특강 신청을 함")