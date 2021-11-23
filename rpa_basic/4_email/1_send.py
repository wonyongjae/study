import smtplib
from account import *

with smtplib.SMTP("smtp.gmail.com", 587) as smtp:
    # 연결이 잘 수립되는지 확인
    smtp.ehlo()
    # 모든 내용이 암호화되어 전송
    smtp.starttls()
    # 로그인
    smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)

    subject = "test maill" # 메일 제목
    body = "mail body" # 메일 본문
    
    msg = f"Subject: {subject}\n{body}" # 줄 바꿈으로 제목과 본문을 인식
    
                # 발신자, 수신자, 정해진 형식의 메시지
    smtp.sendmail(EMAIL_ADDRESS, "dnjsalsl9182@naver.com", msg)
    