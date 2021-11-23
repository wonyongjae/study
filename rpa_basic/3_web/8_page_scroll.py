from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

browser = webdriver.Chrome()
browser.maximize_window()

browser.get('https://shopping.naver.com/home/p/index.naver')
time.sleep(1)


# 맥북 max 입력
# browser.find_element_by_xpath('//*[@id="autocompleteWrapper"]/input[1]').send_keys('맥북 max')

# 검색 버튼 클릭
# browser.find_element_by_xpath('//*[@id="autocompleteWrapper"]/a[2]').click()
time.sleep(1)

# 엔터로 입력
elem = browser.find_element_by_xpath('//*[@id="autocompleteWrapper"]/input[1]')
elem.send_keys('맥북 max')
elem.send_keys(Keys.ENTER)

# 스크롤
# 지정한 위치로 스크롤 내리기
# 모니터 높이인 1080 위치로 스크롤 내리기
# browser.execute_script('window.scrollTo(0, 1080)') # 1920 * 1080 (모니터 해상도에 따라서 다름)
# browser.execute_script('window.scrollTo(0, 2080)')

# 화면 가장 아래로 스크롤 내리기
# browser.execute_script('window.scrollTo(0, document.body.scrollHeight)')

# 스크롤 계속 내리기
# 동적 페이지에 대해서 마지막까지 스크롤 반복 수행
interval = 2 # 2초에 한번씩 스크롤 내리기

# 현재 문서 높이를 가져와서 저장
prev_height = browser.execute_script('return document.body.scrollHeight')

# 반복 수행
while True:
    # 스크롤을 화면 가장 아래로 내림
    browser.execute_script('window.scrollTo(0, document.body.scrollHeight)')

    # 페이지 로딩 대기 (2초)
    time.sleep(interval)

    # 현재 문서 높이 가져와서 저장
    curr_height = browser.execute_script('return document.body.scrollHeight')

    if curr_height == prev_height: 
        # 직전 높이와 같으면, 높이 변화가 없으면 반복문 탈출(모든 스크롤 동작 완료)
        break

    prev_height = curr_height

# 맨 위로 다시 올리기
browser.execute_script('window.scrollTo(0, 0)')

time.sleep(3)
browser.quit()