from selenium import webdriver
import time

browser = webdriver.Chrome()
browser.maximize_window()       # 창 최대화
browser.get('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio')

# frame 전환
browser.switch_to.frame('iframeResult')
# //*[@id="html"]
elem = browser.find_element_by_xpath('//*[@id="html"]')

# 선택이 안되어 있으면 선택하기
if elem.is_selected() == False:     # 라디오 버튼이 선택되어 있지 않으면
    print("선택하기")
    elem.click()
else:                               # 라디오 버튼이 선택되어 있을 시
    print("이미 선택 되어 있으므로 아무것도 안함")

time.sleep(5) # 5초 대기

# 선택이 안되어 있으면 선택하기
if elem.is_selected() == False:     # 라디오 버튼이 선택되어 있지 않으면
    print("선택하기")
    elem.click()
else:                               # 라디오 버튼이 선택되어 있을 시
    print("이미 선택 되어 있으므로 아무것도 안함")

time.sleep(5) # 5초 대기
browser.quit()