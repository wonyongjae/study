# pip install selenium
# chrome://version/ 크롬 버전 확인
# https://chromedriver.chromium.org/downloads 크롬 드라이버 설치

from selenium import webdriver

# browser = webdriver.Chrome("./chromedriver.exe")
browser = webdriver.Chrome()
browser.get("http://daum.net")\

""" 터미널로 작업

PS C:\Users\user\Desktop\PythonWorkspace> python
>>> from selenium import webdriver 
>>> browser = webdriver.Chrome() 
>>> browser.get("http://naver.com") # 네이버 이동
>>> elem = browser.find_element_by_link_text("카페")

>>> elem.get_attribute("href") 
'https://section.cafe.naver.com/'

>>> elem.get_attribute("class") 
'nav'

>>> elem.click()
>>> browser.back()
>>> browser.forward()
>>> browser.refresh()

>>> elem = browser.find_element_by_id("query")
>>> elem                                     
<selenium.webdriver.remote.webelement.WebElement (session="e55cc40879447bd1d3208443f2fe448e", element="44449d54-1e7a-4902-aefb-b5c2fe3c7e58")>

>>> elem.send_keys("인공지능")

>>> from selenium.webdriver.common.keys import Keys  # 엔터키를 동작하기 위해 필요한 라이브러리
>>> elem.send_keys(Keys.ENTER)




>>> elem = browser.find_element_by_id("query")
>>> elem.send_keys("나도코딩")
>>> elem.send_keys(Keys.ENTER)
>>> elem = browser_find_element_by_tag_name("a")
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'browser_find_element_by_tag_name' is not defined
>>> elem = browser.find_element_by_tag_name("a")
>>> elem
<selenium.webdriver.remote.webelement.WebElement (session="e55cc40879447bd1d3208443f2fe448e", element="73f06e2b-2a21-4047-bb2e-ef27a47244b0")>
>>> elem.get_attribute("href") 
'https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%98%EB%8F%84%EC%BD%94%EB%94%A9#lnb'

>>> for e in elem:     
...     e.get_attribute("href")

>>> browser.get("http://daum.net")      # 다음으로 이동
>>> elem = browser.find_element_by_name("q") 
>>> elem.send_keys("인공지능")

>>> elem.clear() 
>>> elem.send_keys("인공지능")

>>> elem = browser.find_element_by_xpath('//*[@id="daumSearch"]/fieldset/div/div/button[2]') 
>>> browser.save_screenshot("daum.png") 
>>> browser.quit()


"""

# 오류 코드
# browser.find_element_by_xpath("//*[@id="daumSearch"]/fieldset/div/div/button[2]")

# 위의 오류를 위해서 쌍따움표를 쓰지 않고 호따음표를 쓰는 게 나음 == 웹페에지에서 작업할 시
browser.find_element_by_xpath('//*[@id="daumSearch"]/fieldset/div/div/button[2]')