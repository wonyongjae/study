from imap_tools import MailBox
from account import *

# import time
# print(time.strftime('%d-%b-%Y')) # 현재 날짜 = 일-요일-연도
# import datetime
# dt = datetime.datetime.strftime("2021-11-14", "%Y-%m-%d")
# print(type(dt))
# print(dt.strfime('%d-%b-%Y'))

# mailbox = MailBox("imap.gmail.com", 993)
# mailbox.login(EMAIL_ADDRESS, EMAIL_PASSWORD, initial_folder="INBOX")
#
with MailBox("imap.gmail.com", 993).login(EMAIL_ADDRESS, EMAIL_PASSWORD, initial_folder="INBOX") as mailbox:
    # for msg in mailbox.fetch(limit=5, reverse=True):
    #     print("[{}] {}".format(msg.from_, msg.subject))

    #  읽지 않은 메일 가져오기
    # for msg in mailbox.fetch('(UNSEEN)'):
    #     print("[{}] {}".format(msg.from_, msg.subject))

    #  특정인이 보낸 메일 가져오기
    # for msg in mailbox.fetch('(FROM dnjsalsl9182@gmail.com)', limit=5, reverse=True):
    #      print("[{}] {}".format(msg.from_, msg.subject))

    # 어떤 글자를 포함하는 메일(제목,본문)
    # for msg in mailbox.fetch('(TEXT "avi")'):
    #        print("[{}] {}".format(msg.from_, msg.subject))

    #  어떤 글자를 포함하는 메일(제목olny)
    # for msg in mailbox.fetch('(SUBJECT "d")'):
    #         print("[{}] {}".format(msg.from_, msg.subject))

    # 어떤 글자(한글)을 포함하는 메일 필터링(제목만)
    # for msg in mailbox.fetch(limit=5, reverse=True):
    #     if "용재" in msg.subject:
    #         print("[{}] {}".format(msg.from_, msg.subject))

    # 특정 날짜 이후에 온 메일
    # for msg in mailbox.fetch('(SENTSINCE 07-Nov-2021)', reverse=True, limit=5):
    #     print("[{}] {}".format(msg.from_, msg.subject))

    # 특정 날짜에 온 메일
    # for msg in mailbox.fetch('(ON 07-Nov-2021)', reverse=True, limit=5):
    #     print("[{}] {}".format(msg.from_, msg.subject))
    
    # 두 가지 이상의 조건을 모두 만족하는 메일
    # for msg in mailbox.fetch('(ON 07-Nov-2021 TEXT "avi")', reverse=True, limit=5):
    #     print("[{}] {}".format(msg.from_, msg.subject))
    

    # 둘 중 하나라도 조건을 모두 만족하는 메일
    for msg in mailbox.fetch('(OR ON 07-Nov-2021 TEXT "avi")', reverse=True, limit=5):
         print("[{}] {}".format(msg.from_, msg.subject))