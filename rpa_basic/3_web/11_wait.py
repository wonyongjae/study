from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

browser = webdriver.Chrome()
browser.maximize_window()

# 항공권 검색 및 출력
# xpath 이용

browser.get('https://flight.naver.com/')
time.sleep(3)

# 가는 날 클릭
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[2]/button[1]').click()
time.sleep(0.5)

# 가는 날 선택
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[10]/div[2]/div[1]/div[2]/div/div[2]/table/tbody/tr[3]/td[5]/button').click()
# //*[@id="__next"]/div/div[1]/div[11]/div[2]/div[1]/div[2]/div/div[3]/table/tbody/tr[5]/td[4]/button
time.sleep(0.5)

# 오는 날 클릭
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[2]/button[2]').click()
time.sleep(0.5)

# 오는 날 선택
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[10]/div[2]/div[1]/div[2]/div/div[2]/table/tbody/tr[3]/td[7]/button').click()
time.sleep(0.5)
# //*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[1]/button[2]
# 도착지 클릭
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[1]/button[2]').click()
time.sleep(0.5)
# //*[@id="__next"]/div/div[1]/div[4]/div/div/div[2]/div[1]/button[2]
# 국내 선택
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[10]/div[2]/section/section/button[1]').click()
time.sleep(0.5)

# 제주도 선택
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[10]/div[2]/section/section/div/button[2]').click()
time.sleep(0.5)

# 항공권 선택
browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[4]/div/div/button').click()

# time.sleep(10)
# sleep 대신 기다리는 라이브러리 사용
try:  
    elem = WebDriverWait(browser, 10).until(EC.presence_of_element_located((By.XPATH, '//*[@id="__next"]/div/div[1]/div[5]/div/div[2]/div[2]/div/button')))
    print(elem.text)
# xpath의 값이 나올 때까지 기다림
except:
    print("실패")

# 첫번째 결과 출력
# elem = browser.find_element_by_xpath('//*[@id="__next"]/div/div[1]/div[5]/div/div[2]/div[2]/div/button')
# print(elem.text) # element 내에 있는 text 부분 출력

time.sleep(3)
