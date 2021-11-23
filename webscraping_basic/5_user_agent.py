import requests

# https://www.whatismybrowser.com/detect/what-is-my-user-agent 
# 유저 에이전트 정보 알려주는 사이트


url = "http://nadocoding.tistory.com"
headers = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()

with open("nadocoding.html", "w", encoding="utf8") as f:
    f.write(res.text)