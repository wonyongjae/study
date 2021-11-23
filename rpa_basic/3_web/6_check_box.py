from selenium import webdriver
import time
from selenium.webdriver.common.by import By

browser = webdriver.Chrome()
browser.maximize_window()

browser.get('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox')

browser.switch_to.frame('iframeResult')

# 둘다 같음 
# elem = browser.find_element_by_xpath('//*[@id="vehicle1"]')
elem = browser.find_element(By.XPATH,'//*[@id="vehicle1"]')
# elem = browser.find_element(By.ID,'vehicle1')

time.sleep(2)

if elem.is_selected() == False:
    print("선택하기")
    elem.click()
else:
    print("이미 선택되어 있음")

time.sleep(2)
browser.quit()