import requests
from bs4 import BeautifulSoup

for year in range(2015,2021):
    #headers = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36"}
    url = f"https://search.daum.net/search?w=tot&q={year}%EB%85%84%EC%98%81%ED%99%94%EC%88%9C%EC%9C%84&DA=MOR&rtmaxcoll=MOR"
    res = requests.get(url)
    res.raise_for_status()

    soup = BeautifulSoup(res.text, "lxml")

    imges = soup.find_all("img", attrs={"class":"thumb_img"})

    for idx, imge in enumerate(imges):
        #print(imge["src"])
        image_url=imge["src"]
        if image_url.startswith("//"):
            image_url = "https:"+image_url
        
        print(image_url)
        image_res = requests.get(image_url)
        image_res.raise_for_status()

        with open("movie_{}_{}.jpg".format(year, idx+1), "wb") as f:
            f.write(image_res.content)
        
        if idx >= 4:  # 상위 5개까지 이미지파일을 가져오면 아래 브레이크문을 실행시켜 종료시키겠음
            break