from selenium import webdriver
import time
# from msedge.selenium_toos import Edge, EdgeOption
# from msedge.selenium_tools import EdgeOption
# from selenium.webdriver.common.keys import Keys
# from selenium.webdriver.chrome.options import Options

# chrome_options = Options()
# chrome_options.add_experimental_option("debuggerAddress", "127.0.0.1:9222")
# chrome_driver = "chromedriver.exe"
# driver = webdriver.Chrome()
# driver.get('https://naver.com')
# chrome_options = Options()
# chrome_options.add_experimental_option("detach", True)

browser = webdriver.Chrome() # "./chromedriver.exe"
# 1. 네이버 이동
browser.get("http://naver.com")

# 2. 로그인 버튼 클릭
# elem = browser.find_element_by_class_name("link_login")
# elem.click()
#browser.implicitly_wait(10)

# 3. id, pw 입력
# browser.find_element_by_id("id").send_keys("dnjsalsl9182")
# browser.find_element_by_id("pw").send_keys("dydwo9182!@")
# browser.find_element_by_id("id").send_keys("naver_id")
# browser.find_element_by_id("pw").send_keys("naver_pw")

# 4. 로그인 버튼 클릭
# browser.find_element_by_id("log.login").click()

# time.sleep(3)

# 5. id 를 새로 입력
# browser.find_element_by_id("id").clear()
# browser.find_element_by_id("id").send_keys("my_id")

# 6. html 정보 출력
print(browser.page_source)
time.sleep(10)

# 7. 브라우저 종료
browser.quit()