### 동적 스크래핑 ###

from selenium import webdriver
browser = webdriver.Chrome()
browser.maximize_window()

# 페이지이동

url = "https://play.google.com/store/movies/top"
browser.get(url)


# 스크롤 내리기
# 모니터(해상도) 높이인 1080위치로 스크롤 내리기
# browser.execute_script("window.scrollTo(0, 1080)") # 1920 X 1080
# browser.execute_script("window.scrollTo(0, 2080)") # 위에 보다 더 내리기
# browser.execute_script("window.scrollTo(0, 0)") # 다시 위로 올리기

# # 화면 가장 아래로 스크롤 내리기
# browser.execute_script("window.scrollTo(0, document.body.scrollHeight)")

import time
interval = 2 # 2초에 한번씩 스크롤 내림

# 현재 문서 높이를 가져와서 저장
prev_height = browser.execute_script("return document.body.scrollHeight")

# 반복수행

while True:
    # 화면 가장 아래로 스크롤 내리기
    browser.execute_script("window.scrollTo(0, document.body.scrollHeight)")
    # 페이지 로딩 대기
    time.sleep(interval)
    # 현재 문서 높이를 가져와서 저장
    curr_height = browser.execute_script("return document.body.scrollHeight")
    # 스크롤을 내린 높이와 내리기 전의 높이가 같은지 비교
    if curr_height == prev_height:
    # 높이가 똑같다면 스크롤을 전부 내린 것으로 간주하고 while문을 탈출
        break

    prev_height = curr_height
print("스크롤 완료")


import requests
from bs4 import BeautifulSoup

# 구글 무비 차트 빼오기

# url = "https://play.google.com/store/movies/top"
# headers = {
#     "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36",
#     "Accept-Language":"ko-KR,ko"  # 한국어 페이지를 요청
#     }
# res = requests.get(url,headers=headers)
# res.raise_for_status()

soup = BeautifulSoup(browser.page_source, "lxml")

# movies = soup.find_all("div", attrs={"class":["ImZGtf mpg5gc","Vpfmgd"]})
movies = soup.find_all("div", attrs={"class":"Vpfmgd"})
print(len(movies))

# with open("movie.html","w",encoding="utf8") as f:
#     # f.write(res.text)
#     f.write(soup.prettify()) # html문서를 예쁘게 출력

for movie in movies:
    title = movie.find("div", attrs={"class":["WsMG1c nnK0zc"]}).get_text()
    #print(title)

    # 할인 전 가격
    original_price = movie.find("span", attrs={"class":"SUZt4c djCuy"})
    if original_price:
        original_price = original_price.get_text()
    else:
        # print(title, "  <할인되지 않은 영화 제외>")
        continue

    # 할인된 가격
    price = movie.find("span", attrs={"class":"VfPpfd ZdBevf i5DZme"}).get_text()

    # 링크
    link = movie.find("a", attrs={"class":"JC71ub"})['href']

    # 올바른 링크 : https://play.google.com + link

    print(f"제목 : {title}")
    print(f"할이 전 금액 : {original_price}")
    print(f"할이 된 금액 : {price}")
    print("링크 : ","https://play.google.com" + link)
    print("-"*100)

browser.quit()