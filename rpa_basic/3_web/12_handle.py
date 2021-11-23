from selenium import webdriver
import time

browser = webdriver.Chrome()
browser.maximize_window()

browser.get('https://www.w3schools.com/tags/att_input_type_radio.asp')
curr_handle = browser.current_window_handle

print(curr_handle)

# 클릭! 
browser.find_element_by_xpath('//*[@id="main"]/div[2]/a').click()

# 모든 핸들 정보
handles = browser.window_handles 


for handle in handles:
    # 각 핸들 정보
    print(handle)
    # 각 핸들로 이동
    browser.switch_to.window(handle)
    # 출력해보면 현재 핸들(브라우저)의 제목 표시
    print(browser.title)
    print()

# 새로 이동된 브라우저에서 자동화 작업을 수행...
time.sleep(3)

# 해당 브라우저 종료
print("현재 핸들 닫기")
browser.close()

#이전 핸들로 컴백
print("이전 핸들로 돌아가기")
browser.switch_to.window(curr_handle)

print(browser.title)
time.sleep(3)
browser.get('http://google.com')
time.sleep(3)