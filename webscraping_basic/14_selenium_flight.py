from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

### 홈페이지 개편으로 현재는 사용 불가능. 다시 태그 확인해서 따줘야됨 ###
### 홈페이지 개편으로 현재는 사용 불가능. 다시 태그 확인해서 따줘야됨 ###
### 홈페이지 개편으로 현재는 사용 불가능. 다시 태그 확인해서 따줘야됨 ###

browser = webdriver.Chrome()
browser.maximize_window()  # 창 최대화

url ="https://flight.naver.com/"
browser.get(url) # url로 이동

# 가는날 선택

browser.find_element_by_link_text("가는날 선택").click()

# 이번달 27일. 28일 선택
# browser.find_elements_by_link_text("27")[0].click() # 이번달
# browser.find_elements_by_link_text("28")[0].click() # 이번달

# 다음달 27일. 28일 선택
# browser.find_elements_by_link_text("27")[1].click() # 다음달
# browser.find_elements_by_link_text("28")[1].click() # 다음달

# 이번달 27일. 다음달 28일 선택
browser.find_elements_by_link_text("27")[0].click() # 이번달
browser.find_elements_by_link_text("28")[1].click() # 다음달

# 제주도 선택
browser.find_element_by_xpath() # xpath를 이용해서 선택

# 항공권 검색 클릭
browser.find_element_by_link_text("항공권 검색").click()

#   브라우저를 최대 10초까지 기다리게 하고, 로딩이 끝나면 바로 일처리
try:
    elem = WebDriverWait(browser, 10). until(EC.presence_of_element_located(By.XPATH,"xpath 주소"))
    # 성공했을 때 동작 수행
    print(elem.text) # 첫번째 결과 출력
finally:
    browser.quit()

# 첫번째 결과 출력
elem = browser.find_element_by_xpath()
print(elem.text)