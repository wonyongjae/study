import requests
import re
from bs4 import BeautifulSoup

# 쿠팡에서 웹스크래핑 및 크롤링을 거부하고 있기 때문에 위의 유저-에이전트를 이용함
headers = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36"}

for i in range(1,6):
    # print("현재 페이지:",i)
    url = f"https://www.coupang.com/np/search?q=%EB%85%B8%ED%8A%B8%EB%B6%81&channel=user&component=&eventCategory=SRP&trcid=&traid=&sorter=scoreDesc&minPrice=&maxPrice=&priceRange=&filterType=&listSize=36&filter=&isPriceRange=false&brand=&offerCondition=&rating=0&page={i}&rocketAll=false&searchIndexingToken=1=6&backgroundColor="
    res = requests.get(url, headers=headers)
    res.raise_for_status()
    soup = BeautifulSoup(res.text, "lxml")

    items = soup.find_all("li", attrs={"class":re.compile("^search-product")})
    # print(items[0].find("div",attrs={"class":"name"}).get_text())

    for item in items:
        # 무료배송만 보기
        ad_badge = item.find("span",attrs={"class":"ad_badge-text"})
        if ad_badge:
            # print("        <광고 상품 제외합니다>")
            continue
        name = item.find("div", attrs={"class":"name"}).get_text() # 제품명
        # LG제품 제외
        if "LG" in name:
            # print("        <LG 상품 제외합니다>")
            continue
        price = item.find("strong", attrs={"class":"price-value"}).get_text() # 가격
        rate = item.find("em", attrs={"class":"rating"}) # 평점
        if rate:
            rate = rate.get_text()
        else:
            # print("        <평점 없는 상품 제외합니다>")
            continue
        rate_cnt = item.find("span", attrs={"class":"rating-total-count"}) # 평점수
        if rate_cnt:
                rate_cnt = rate_cnt.get_text()[1:-1] # 예: (26)
        else:
            # print("        <평점 수 없는 상품 제외합니다>")
            continue
        #  리뷰 1000개 이상, 평점 4.5 이상 되는 것만 조회

        link = item.find("a", attrs={"class":"search-product-link"})["href"]
        if float(rate) >= 4.5 and int(rate_cnt) >= 1000:
            print(f"제품명 : {name}")
            print(f"가격 : {price}")
            print(f"평점 : {rate}점 / 리뷰 {rate_cnt}개")
            print("바로가기 : {}".format("https://www.coupang.com"+link))
            print("-------------------------------------------------------------------------------------------------")
            # print("제품명 :",name)
            # print("가격 :",price)
            # print("평점 :",rate)
            # print("평점 수 :",rate_cnt)
            # print("-------------------------------------------------------------------------------------------------")