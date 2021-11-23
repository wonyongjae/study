# pip install requests
import requests # 스크래핑에 필요한 모듈

#res = requests.get("http://naver.com")
res = requests.get("http://google.com")
#res = requests.get("http://nadocoding.tistory.com")
res.raise_for_status()

"""
위 내용은 두개를 통째로 이어서 씀
res = requests.get("http://nadocoding.tistory.com")
res.raise_for_status()

"""

print("응답코드 : ", res.status_code) # 200이면 정상 404면 에러

# if res.status_code == requests.codes.ok:
#     print("정상입니다.")
# else:
#     print("문제가 생겼습니다. [에러코드 ", res.status_code, "]")


# print("웹 스크래핑을 진행합니다.")

print(len(res.text))
print(res.text)

with open("mygoogle.html", "w", encoding="utf8") as f:
    f.write(res.text)
