import smtplib
from account import *
from email.message import EmailMessage

msg = EmailMessage()
msg["Subject"] = "테스트 메일 입니다." # 제목
msg["From"] = EMAIL_ADDRESS          # 보내는 사람
msg["To"] = "dnjsalsl9182@naver.com" # 받는 사람

# 여러 명에서 보낼 때 1
# msg["To"] = "dnjsalsl9182@naver.com, dnjsalsl9182@gmail.com"

# 여러 명에서 보낼 때 2
# to_list = ["dnjsalsl9182@naver.com","dnjsalsl9182@gmail.com"]
# msg["To"] = ", ".join(to_list)


# 참조
# msg["Cc"] = "dnjsalsl9182@naver.com"

# 비밀참조
# msg["Bcc"] = "dnjsalsl9182@naver.com"


msg.set_content("테스트 본문입니다.") # 본문

with smtplib.SMTP("smtp.gmail.com", 587) as smtp:
    smtp.ehlo()
    smtp.starttls()
    smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)
    smtp.send_message(msg)