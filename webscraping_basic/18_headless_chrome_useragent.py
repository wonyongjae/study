from selenium import webdriver


### https://selenium-python.readthedocs.io/ ####
### selenium 에 관해 더 공부 할 수 있는 사이트


options = webdriver.ChromeOptions()
options.headless = True
options.add_argument("window-size=1920x1080")

# user-agent 값을 바꿔줘야 할 상황이 자주 발생할 수도 있음
options.add_argument("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36")

browser = webdriver.Chrome(options=options)
browser.maximize_window()

url = "https://www.whatismybrowser.com/detect/what-is-my-user-agent"
browser.get(url)

# Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36
detected_value = browser.find_element_by_id("detected_value")
print(detected_value.text)
browser.quit()