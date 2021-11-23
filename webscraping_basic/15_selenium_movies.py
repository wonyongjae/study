import requests
from bs4 import BeautifulSoup

# 구글 무비 차트 빼오기

url = "https://play.google.com/store/movies/top"
headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36",
    "Accept-Language":"ko-KR,ko"  # 한국어 페이지를 요청
    }
res = requests.get(url,headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")

movies = soup.find_all("div", attrs={"class":"ImZGtf mpg5gc"})
print(len(movies))

# with open("movie.html","w",encoding="utf8") as f:
#     # f.write(res.text)
#     f.write(soup.prettify()) # html문서를 예쁘게 출력

for movie in movies:
    title = movie.find("div", attrs={"class":"WsMG1c nnK0zc"}).get_text()
    print(title)