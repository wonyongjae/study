# pip install beautifulsoup4 
# # 웹 스크래핑을 위해 필요한 라이브러리 install

# pip install lxml 
# # 구문을 해석하기 위한 paser install


import requests
from bs4 import BeautifulSoup

url = "https://comic.naver.com/webtoon/weekday"
res = requests.get(url)
res.raise_for_status()

soup = BeautifulSoup(res.text, "lxml")
# print(soup.title)
# print(soup.title.get_text())
# print(soup.a) # soup 객체에서 처음 발견되는 a element 출력
# print(soup.a.attrs) # a element 의 속성 정보 출력
# print(soup.a["href"]) # a element 의 href 속성 '값' 정보를 출력



# print(soup.find("a", attrs={"class":"Nbtn_upload"})) # class = "Nbtn_upload"  인 a element를 찾아줘
# print(soup.find(attrs={"class":"Nbtn_upload"}))# class = "Nbtn_upload"  인 어떤 element를 찾아줘


# print(soup.find("li", attrs={"class":"rank01"}))
# rank1 = soup.find("li", attrs={"class":"rank01"})
# print(rank1.a.get_text()) # get_text() : 태그 안의 글자 정보만 출력

# rank2 = rank1.next_sibling.next_sibling
# rank3 = rank2.next_sibling.next_sibling
# print(rank3.a.get_text())
# rank2 = rank3.previous_sibling.previous_sibling
# print(rank2.a.get_text())

# print(rank1.parent)

# rank2 = rank1.find_next_sibling("li")
# print(rank2.a.get_text())
# rank3 = rank2.find_next_sibling("li")
# print(rank3.a.get_text())
# rank2 = rank3.find_previous_sibling("li")
# print(rank2.a.get_text())


# rank1 = rank1.find_next_siblings("li")
# print(rank1.a.get_text())


webtoon = soup.find("a", text="소녀의 세계-2부 74화")
print(webtoon)