import requests
from bs4 import BeautifulSoup
import re
#   변수 = soup.find("div", attrs={         "class":["ㅇㅇ","ㅁㅁ","ㅅㅅ"], "id":["aa", "bb", "cc"]...           }        ) .get_text()
#   한번에 여러 태그 이용 가능

def create_soup(url):
    res = requests.get(url)
    res.raise_for_status()
    soup = BeautifulSoup(res.text, "lxml")
    return soup

def print_news(index, title, link):
    print("{}. {}".format(index+1, title))
    print(" (링크 : {})".format(link))


def scrape_weather():
    print("[오늘의 날씨]")
    url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B5%EC%82%B0+%EB%82%A0%EC%94%A8"
    soup = create_soup(url)

    # 어제보다 ~~~
    cast = soup.find("p", attrs={"class":"summary"}).get_text().strip()
    #print(cast)

    # 현재온도
    curr_temp = soup.find("div", attrs={"class":"temperature_text"}).get_text().strip()
    # 강수확률 / 습도 / 풍향
    rain_rate = soup.find("dl", attrs={"class":"summary_list"}).get_text().strip()
    #print(rain_rate)

    # 미세먼지
    dust_rate = soup.find("ul", attrs={"class":"today_chart_list"}).get_text().strip()
    #print(dust_rate)

    # 주간예보
    today_weather_rate = soup.find("div", attrs={"class":"cell_weather"}).get_text().strip()
    #print(today_weather_rate)

    # 최저, 최고기온
    min_rate=soup.find("span", attrs={"class":"lowest"}).get_text().strip()
    max_rate=soup.find("span", attrs={"class":"highest"}).get_text().strip()

    print(cast)
    print(rain_rate)
    print(dust_rate)
    print(today_weather_rate)
    print(curr_temp, f"   ({min_rate} / {max_rate})")
    print()

# def scrape_headline_news():
#     print("[헤드라인 뉴스]")
#     url = "https://news.naver.com"
#     soup = create_soup(url)

#     news_list = soup.find("ul", attrs={"class":"hdline_article_list"}).find_all("li", limit=5)

#     for index, news in enumerate(news_list):
#         title = news.find("a").get_text().strip()
#         link = url + news.find("a")["href"]
#         print_news(index,title,link)
#     print()

# def scrape_it_news():
#     print("[IT 뉴스]")
#     url = "https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid1=105&sid2=230"
#     soup = create_soup(url)

#     news_list = soup.find("ul", attrs={"class":"type06_headline"}).find_all("li", limit=5)

#     for index, news in enumerate(news_list):
#         a_idx = 0
#         img = news.find("img")
#         if img:
#             a_idx = 1

#         a_tag = news.find_all("a")[a_idx]
#         title = a_tag.get_text().strip()
#         link = a_tag["href"]
#         print_news(index,title,link)
#     print()

def scrape_english():
    print("[오늘의 영어 회화]")
    url = "https://www.hackers.co.kr/?c=s_eng/eng_contents/I_others_english&keywd=haceng_submain_lnb_eng_I_others_english&logger_kw=haceng_submain_lnb_eng_I_others_english"
    soup = create_soup(url)
    
    # 정규식 활용 = re.compile("^conv_kor_t")
    sentences = soup.find_all("div", attrs={"id":re.compile("^conv_kor_t")})
    print("(영어 지문)")

    # 8문장이 있다고 가정할 때, index 기준 4~7까지 잘라서 가져옴
    for sentence in sentences[len(sentences)//2:]:
        print(sentence.get_text().strip())
    print()
    print("(한글 지문)")

    # 8문장이 있다고 가정할 때, index 기준 0~3까지 잘라서 가져옴
    for sentence in sentences[:len(sentences)//2]: 
        print(sentence.get_text().strip())
    print()
if __name__ == "__main__":
    scrape_weather() # 오늘의 날씨 정보
    # scrape_headline_news()
    # scrape_it_news()
    scrape_english()