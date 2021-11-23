# pip install selenium.py
# pip install msedge-selenium-tools

# 웹 드라이버 설치
# 우선 크롬(크롬 사용시) 버전 확인 chrome://version/
# 크롬 드라이버 설치 홈페이지 https://chromedriver.chromium.org/downloads 
from selenium.webdriver.common.keys import Keys

from selenium import webdriver

browser = webdriver.Chrome() # "./chromedriver.exe"
browser.get("http://naver.com")

"""

터미널에서 제어

### 파이썬 켜기
python

### selenium 에서 webdriver 임포트
>>> from selenium import webdriver

### 웹 브라우져 . 크롬으로 실행
>>> browser = webdriver.Chrome()

### 네이버로 이동
>>> browser.get("http://naver.com")


### 네이버 로그인창
elem = browser.find_element_by_class_name("link_login") 
>>> elem.click()

### 뒤로가기, 앞으로가기, 새로고침
>>> browser.back()
>>> browser.forward() 
>>> browser.refresh()

### 검색창 찾기 id로 찾기 ("qurey")
>>> elem = browser.find_element_by_id("query") 
>>> from selennium.webdriver.common.keys import Keys

### 검색창에 검색
>>> elem.send_keys(" # 검색하고 싶은 내용 ")
>>> elem.send_keys(Keys.ENTER)                -- 괄호 안에 K = 대문자


>>> elem=browser.find_element_by_tag_name("a")    -- 태그로 정보 가져오기 ("a")
>>> elem=browser.find_elements_by_tag_name("a")   -- 태그 정보 몽땅 가져오기 ("a") 

### for문으로 돌려서 가져오기
>>> for e in elem:
...     e.get_attribute("href")


### 다음으로 이동
>>> browser.get("http://daum.net") 

### 검색창 찾기 name으로 찾기("q")
>>> elem=browser.find_element_by_name("q") 
>>> elem.send_keys("네이버")                      -- 괄호 안에 K = 대문자

### xpath를 복사해와서 xpath를 이용하여 검색단추 누르기 "" 안에 ""있으면 ''으로 바꿔주기
>>> elem=browser.find_element_by_xpath("//*[@id='daumSearch']/fieldseet/div/div/button[2]")        
>>> elem.click()

### 브라우저 종료
>>> browser.quit()

### 파이썬 종료
>>> exit()
"""

