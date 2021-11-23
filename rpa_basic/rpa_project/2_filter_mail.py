# [신청 메일 양식]
# 제목 : 파이썬 특강 신청 
# 본문 : 닉네임/전화번호 뒤 4자리 (Random)
# (ex) 원용재/1234

from account import *
from imap_tools import MailBox

#  지원자 리스트
applicant_list = []

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

# for applicant in applicant_list:
#     print(applicant)