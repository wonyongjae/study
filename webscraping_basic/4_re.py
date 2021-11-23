# 정규식 == 유효성 검사와 비슷
# w3schools.com 에서 Python RegEx // 자세한 내용 더 배울 수 있음


import re
#  정규식 모듈 불러오기

p = re.compile("ca.e") 
# . (ca.e) : 하나의 문자를 의미 => ca'.'e
# ^ (^de) : 문자열의 시작 => 'de'sk, 'de'stination // de로 시작
# $ (se$) : 문자열의 끝 => ca'se' , ba'se' // se로 끝


def print_match(m):
    if m:
        print("m.group() :",m.group()) # 일치하는 문자열 반환
        print("m.string :",m.string) # 입력받은 문자열
        print("m.start() :",m.start()) # 일치하는 문자열의 시작 index
        print("m.end() :",m.end()) # 일치하는 문자열의 끝 index
        print("m.span() :",m.span()) # 일치하는 문자열의 (시작 , 끝) index
    else:
        print("매칭되지 않음")

#m = p.match("careless") # 매칭됨 / match : 주어진 문자열의 처음부터 일치하는지 확인
#m = p.search("good care") 
#m = p.search("careless") # search : 주어진 문자열 중에 일치하는 게 있는지 확인
#print_match(m)

# lst=p.findall("good care cafe") # findall : 일치하는 모든 것을 리스트 형태로 반환
# print(lst)


# 1. p = re.compile("원하는 형태")
# 2. m = p.match("비교할 문자열") : 주어진 문자열의 처음부터 일치하는지 확인
# 3. m = p.search("careless") # search : 주어진 문자열 중에 일치하는 게 있는지 확인
# 4. lst = p.findall("비교할 문자열") : 일치하는 모든 것을 "리스트" 형태로 반환

# 원하는 정규식
# . (ca.e) : 하나의 문자를 의미 => ca'.'e
# ^ (^de) : 문자열의 시작 => 'de'sk, 'de'stination // de로 시작
# $ (se$) : 문자열의 끝 => ca'se' , ba'se' // se로 끝
