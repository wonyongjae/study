from selenium import webdriver
import time
from selenium.webdriver.common import action_chains
from selenium.webdriver.common.action_chains import ActionChains

browser = webdriver.Chrome()
browser.maximize_window()

browser.get('https://www.w3schools.com/html/')

time.sleep(3)

elem = browser.find_element_by_xpath('//*[@id="leftmenuinnerinner"]/a[62]')

# 특정 영역 스크롤

# 방법 1 : ActionChain
# act = ActionChains(browser)
# act.move_to_element(elem).perform()

# 방법 2 : 좌표 정보 이용
# xy = elem.location_once_scrolled_into_view # 함수가 아니니 () 안씀
# print("type : ", type(xy)) # dict
# print("type : ", xy)

time.sleep(3)

elem.click()

time.sleep(3)
