from selenium import webdriver
import time

browser = webdriver.Chrome()
browser.get('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio')

# frame 전환
browser.switch_to.frame('iframeResult')
# //*[@id="html"]
elem = browser.find_element_by_xpath('//*[@id="html"]')
elem.click()

browser.switch_to.default_content() # 상위로 빠져 나옴

time.sleep(5)
browser.quit()
