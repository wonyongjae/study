# Quiz) selenium 을 이용하여 아래 업무를 자동으로 수행하는 프로그램 작성

# 1. http://www.w3school.com 접속
# 2. 화면 중간 Learn html 클릭
# 3. 상단 메뉴 중 how to 클릭
# 4. 좌측 메뉴 중 contact form 메뉴 클릭
# 5. 입력란에 아래 값 입력
#     first name : yongjae
#     last name : won
#     country : korea
#     subject : 야호! 퀴즈 완료!
#     * 위 갑슫ㄹ은 변수로 미리 저장
# 6. 5초 대기후 submit 버튼 클릭
# 7. 5초 대기후 종료

from selenium import webdriver
import time

browser = webdriver.Chrome()
browser.maximize_window()

# 1. http://www.w3school.com 접속
browser.get('https://www.w3schools.com/')


# 2. 화면 중간 Learn html 클릭
browser.find_element_by_xpath('//*[@id="main"]/div[1]/div/div[1]/a[1]').click()
time.sleep(0.5)

# 3. 상단 메뉴 중 how to 클릭
browser.find_element_by_xpath('//*[@id="topnav"]/div/div/a[10]').click()
time.sleep(0.5)

# 4. 좌측 메뉴 중 contact form 메뉴 클릭
# xpath 그대로 가져오기
# browser.find_element_by_xpath('//*[@id="leftmenuinnerinner"]/a[117]').click()
# 텍스트 비교
# browser.find_element_by_xpath('//*[@id="leftmenuinnerinner"]/a[contains(text(), "Contact")]').click()
# 가장 좋은 방법
browser.find_element_by_xpath('//*[@id="leftmenuinnerinner"]/a[text()="Contact Form"]').click()
time.sleep(0.5)

# 5. 입력란에 아래 값 입력
#     first name : yongjae
#     last name : won
#     country : korea
#     subject : 야호! 퀴즈 완료!
#     * 위 값들은 변수로 미리 저장
first_name = "YongJae"
browser.find_element_by_xpath('//*[@id="fname"]').send_keys(first_name)
time.sleep(0.5)
last_name = "Won"
browser.find_element_by_xpath('//*[@id="lname"]').send_keys(last_name)
time.sleep(0.5)

# country = "USA"
# xpath 로 활용
# browser.find_element_by_xpath('//*[@id="country"]/option[text()="{country}"]'.format(country)).click()
browser.find_element_by_xpath('//*[@id="country"]/option[3]').click()

time.sleep(0.5)
subject = "야호! 퀴즈완료!"
browser.find_element_by_xpath('//*[@id="main"]/div[3]/textarea').send_keys(subject)

# 6. 5초 대기후 submit 버튼 클릭
time.sleep(5)
browser.find_element_by_xpath('//*[@id="main"]/div[3]/a').click()

# 7. 5초 대기후 종료
time.sleep(5)
browser.quit()