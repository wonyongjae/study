import requests
from bs4 import BeautifulSoup

url = "https://search.daum.net/search?nil_suggest=btn&w=tot&DA=SBC&q=%EC%9D%B5%EC%82%B0+%EC%9D%B4%EB%8D%94%EB%A6%AC%EC%9B%80"
res = requests.get(url)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")

# with open("quiz.html", "w", encoding="utf8") as f:
#     f.write(soup.prettify())
"""
data_rows = soup.find("ul", attrs={"class":"list_place"})

for row in data_rows:
    columns = row.find_all("li")

    print("=======================익산 e편한세상 정보===========================")
    print(columns[0].find("em", attrs={"class":"mark_count"}).get_text())
    print(columns[1].find("em", attrs={"class":"mark_count"}).get_text())
    print(columns[2].find("em", attrs={"class":"mark_count"}).get_text())
    print(columns[3].find("em", attrs={"class":"mark_count"}).get_text())
    print(columns[4].find("em", attrs={"class":"mark_count"}).get_text())
"""
