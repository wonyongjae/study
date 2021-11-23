from random import *

# cnt = 0
# for i in range(1,51):
#     time = randrange(5,51)
#     if 5 <= time <= 15:
#         print("[0] {0}번째 손님 (소요시간 : {1}분)".format(i,time))
#         cnt += 1
#     else:
#         print("[ ] {0}번째 손님 (소요시간 : {1}분)".format(i,time))
# print("총 탑승 승객 : {}명".format(cnt))

# def open_account():
#     print("새로운 계좌가 생성되었습니다.")

# def deposit(balance, money):
#     print("입금이 완료되었습니다. 잔앤은 {}원 입니다.".format(balance+money))
#     return balance+money
# def withdraw(balance, money):
#     if balance >= money:
#         print("출금이 완료되었습니다. 잔액은 {}원입니다.".format(balance-money))
#         return balance- money
#     else:
#         print("출금이 완료되지 않았습니다. 잔액은 {}원입니다.".format(balance))
#         return balance        
# def withdraw_night(balance, money):
#     commission = 100
#     return commission, balance - money - commission

# balance =0

# balance = deposit(balance, 1000)
# commission, balance = withdraw_night(balance, 500)
# print("수수료는 {}원이며, 잔액은 {}원입니다.".format(commission,balance))

# def profile(name, age=17, main_lang="파이썬"):
#     print("이름:{}\t나이:{}\t주 사용 언어:{}"\
#         .format(name,age,main_lang))

# profile("유재석",20)
# profile("김태호",25,"자바")
# profile("강호동")

# def profile(name, age, *main_lang):
#     print("이름:{}\t나이:{}\t".format(name,age))
#     for lang in main_lang:
#         print(lang, end=" ")
#     print()

# profile("유재석",20, "파이썬", "C", "C++")
# profile("김태호",25,"자바","C#")
# profile("강호동")

# gun = 10

# def checkpoint(soldiers):
#     global gun
#     gun = gun - soldiers
#     print("[함수 내] 남은 총: {}".format(gun))

# def checkpoint_ret(gun,soldiers):
#     gun = gun - soldiers
#     print("[함수 내] 남은 총: {}".format(gun))
#     return gun

# gun = checkpoint_ret(gun,2)
# # print("전체 총 : {}".format(gun))
# # checkpoint(2)
# print("남은 총: {}".format(gun))


# def std_weight(height, gender):
#     if gender =="남자":
#         return height*height*22
#     else:
#         return height*height*21

# height = 175
# gender ="남자"
# weight = round(std_weight(height / 100,gender),2)
# print("키 {0}cm {1}의 표준체중은 {2}kg입니다".format(height,gender,weight))


# import sys
# print("Python", "Java", file=sys.stdout)
# print("Python", "Java", file=sys.stderr)

# scores = {"수학":0, "영어":50, "코딩":100}

# for subject, score in scores.items():
#     print(subject.ljust(8),str(score).rjust(4), sep=":")

# for num in range(1,21):
#     print("대기번호:"+str(num).zfill(3))


# answer = input("아무 값이나 입력하세요 : ")
# print(type(answer))
# print("입력하신 값은 " + answer +"입니다.")


# print("{0: >10}".format(500))

# print("{0: >+10}".format(500))
# print("{0: >+10}".format(-500))



# print("{0:_<+10}".format(500))
# print("{0:+,}".format(10000000000000))

# print("{0:*<+30,}".format(10000000000000))


# print("{0:f}".format(5/3))
# print("{0:.2f}".format(5/3))

# score_file = open("score.txt","w",encoding='utf-8')
# print("수학:0", file=score_file)
# print("영어:50",file=score_file)
# score_file.close()

# score_file=open("score.txt","a",encoding='utf-8')
# score_file.write("과학:80")
# score_file.write("\n코딩:100")
# score_file.close()

# score_file=open("score.txt","r",encoding='utf8')
# print(score_file.readline(), end="")
# print(score_file.readline(), end="")
# print(score_file.readline(), end="")
# print(score_file.readline(), end="")
# score_file.close()

# score_file=open("score.txt","r",encoding='utf8')
# while True:
#     line = score_file.readline()
#     if not line:
#         break
#     print(line, end="")
# score_file.close()


# profile_file = open("profile.pickle", "wb")
# profile = {"이름":"박명수", "나이":30,"취미":["축구","골프","코딩"]}
# print(profile)
# pickle.dump(profile, profile_file)
# profile_file.close()

# profile_file = open("profile.pickle", "rb")

# profile = pickle.load(profile_file)
# print(profile)
# profile_file.close()

# import pickle
# # with open("profile.pickle", "rb") as profile_file:
# #     print(pickle.load(profile_file))

# with open("study.txt", "w", encoding="utf8") as study_file:
#    study_file.write("파이썬을 열심히 공부하고 있어요")
# with open("study.txt", "r", encoding="utf8") as study_file:
#     print(study_file.read())


# for i in range(1,51):
#     with open(f"{i}주차.txt", "w", encoding="utf8") as report_file:
#         report_file.write(f"- {i} 주차 주간보고 -")
#         report_file.write("\n부서 : ")
#         report_file.write("\n이름 : ")
#         report_file.write("\n업무 요약 : ")


# name = "마린"
# hp = 40
# damage = 5

# print(f"{name} 유닛이 생성되었습니다")
# print(f"체력 {hp}, 공격력 {damage}")

# tank_name="탱크"
# tank_hp=150
# tank_damage=35
# print(f"{tank_name} 유닛이 생성되었습니다")
# print(f"체력 {tank_hp}, 공격력 {tank_damage}")

# tank2_name="탱크2"
# tank2_hp=150
# tank2_damage=35
# print(f"{tank2_name} 유닛이 생성되었습니다")
# print(f"체력 {tank2_hp}, 공격력 {tank2_damage}")

# def attack(name, location, damage):
#     print(f"{name} : {location} 방향으로 적군을 공격합니다. [공격력 {damage}]")

# attack(name,"1시",damage)
# attack(tank_name,"1시",tank_damage)
# attack(tank2_name,"1시",tank2_damage)


        # self.damage = damage
        # print(f"{self.name} 유닛이 생성 되었습니다")
        # print(f"체력 {self.hp}, 공격력 {self.damage}")

# marine1 = Unit("마린", 40, 5)
# marine2 = Unit("마린", 40, 5)
# tank = Unit("탱크",150,35)

# wraith1 = Unit("레이스",80,5)
# print(f"유닛이름 : {wraith1.name}, 공격력: {wraith1.damage}")
# wraith2 = Unit("빼앗은 레이스",80,5)
# wraith2.clocking = True
# if wraith2.clocking == True :
#     print(f"{wraith2.name}는 현재 클로킹 상태입니다.")


class Unit:
    def __init__(self, name, hp, speed):
        self.name=name
        self.hp=hp
        self.speed= speed
    def move(self, location):
        print("[지상 유닛 이동]")
        print(f"{self.name} : {location} 방향으로 이동합니다. [속도 {self.speed}]")
class AttackUnit(Unit):
    def __init__(self, name, hp, speed, damage):
        Unit.__init__(self, name, hp, speed)
        self.damage = damage

    def attack(self, location):
        print(f"{self.name} : {location} 방향으로 적군을 공격합니다.[공격력{self.damage}]")

    def damaged(self, damage):
        print(f"{self.name} : {damage} 데미지를 입었습니다.")
        self.hp -= damage
        print(f"{self.name} : 현재 체력은 {self.hp} 입니다.")
        if self.hp <= 0:
            print(f"{self.name} : 파괴되었습니다.")

class Flyable:
    def __init__(self, flying_speed):
        self.flying_speed = flying_speed

    def fly(self, name, location):
        print(f"{self.name} : {location} 방향으로 날아갑니다. [속도 {self.flying_speed}]")

class FlyableAttackUnit(AttackUnit,Flyable):
    def __init__(self, name, hp, damage, flying_speed):
        AttackUnit.__init__(self, name, hp, 0, damage)
        Flyable.__init__(self, flying_speed)\
    
    def move(self, location):
        print("[공중 유닛 이동]")
        self.fly(self.name, location)

# firebat1 = AttackUnit("파이어뱃", 50, 16)
# firebat1.attack("5시")
# firebat1.damaged(25)
# firebat1.damaged(25)

# valkyrie = FlyableAttackUnit("발키리",200,6,5)
# valkyrie.fly(valkyrie.name, "3시")

# vulture = AttackUnit("벌쳐", 80, 10, 20)
# battlecruiser = FlyableAttackUnit("배틀크루져", 500, 25, 3)

# vulture.move("11시")
# battlecruiser.move("9시")

# class BuildingUnit(Unit):
#     def __init__(self, name, hp, location):
#         #Unit.__init__(self, name, hp, 0)
#         super().__init(name, hp, 0)
#         self.location = location

# supply_depot = BuildingUnit("서플라이 디폿", 500, "7시")

# def game_start():
#     print("[알림] 새로운 게임을 시작합니다.")

# def game_over():
#     pass

# game_start()
# game_over() 
# class Unit:
#     def __init__(self):
#         print("Unit 생성자")
# class Flyable:
#     def __init__(self):
#         print("Flyable 생성자")

# class FlyableUnit(Flyable,Unit):
#     def __init__(self):
#         #super().__init__()
#         Unit.__init__(self)
#         Flyable.__init__(self)


# dropship = FlyableUnit()


# class House:
#     def __init__(self, location, house_type, deal_type, price, completion_year):
#         self.location=location
#         self.house_type= house_type
#         self.deal_type = deal_type
#         self.price = price
#         self.completion_year=completion_year

#     def show_detail(self):
#         print(self.location, self.house_type, self.deal_type, self.price, self.completion_year)


# houses =[]
# house1 = House("강남","아파트","매매","10억","2010년")
# house2 = House("마포","오피스텔","전세","5억","2007년")
# house3 = House("강남","빌라","월세","500/50","2000년")

# houses.append(house1)
# houses.append(house2)
# houses.append(house3)


# print(f"총 {len(houses)}개의 매물이 있습니다.")
# for house in houses:
#     house.show_detail()


# try:
#     print("나누기 전용 계산기 입니다.")
#     num=[]
#     num.append(int(input("첫번째 숫자:")))
#     num.append(int(input("두번째 숫자:")))
#     #num.append(int(num[0]/num[1]))
#     print(f"{num[0]} / {num[1]} = {num[2]}")
# except ValueError:
#     print("에러! 잘못된 값을 입력하였습니다!")
# except ZeroDivisionError as err:
#     print(err)
# except Exception as err:
#     print("알 수 없는 에러가 발생")
#     print(err)

# class BigNumberError(Exception):
#     def __init__(self, msg):
#          self.msg = msg
    
#     def __str__(self):
#         return self.msg



# try:
#     print("한 자리 숫자 나누기 전용 계산기")
#     num1 = int(input("첫번째 숫자:"))
#     num2 = int(input("두번째 숫자:"))
#     if num1 >= 10 or num2 >=10:
#         raise BigNumberError(f"입력값 : {num1}, {num2}")
#     print(f"{num1}/{num2}={num1/num2}")
# except ValueError:
#     print("잘못된 값을 입력하였습니다. 한 자리 숫자만 입력하세요")
# except BigNumberError as err:
#     print("에러가 발생하였습니다. 한 자리 숫자만 입력하세요.")
#     print(err)
# finally:
#     print("계산기를 이용해 주셔서 감사합니다.")

# class SoldOutError(Exception):
#     # def __init__(self, msg):
#     #     self.msg = msg
#     # def __str__(self):
#     #     return self.msg
#     pass

# chicken = 10
# waiting =1

# while(True):
#     try:
#         print(f"[남은 치킨 : {chicken}]")
#         order = int(input("몇 마리 주문?"))
#         if order > chicken:
#             print("재료 부족")
#         elif order <= 0:
#             raise ValueError
#         else :
#             print(f"[대기번호 {waiting}] {order} 마리 주문이 완료")
#             waiting +=1
#             chicken -= order
#         if chicken == 0:
#             raise SoldOutError
#     except ValueError :
#         print("잘못된 값을 입력하였습니다.")
#     except SoldOutError:
#         print("재고가 소진되어 더 이상 주문을 받지 않습니다.")
#         break

# import theater_module

# theater_module.price(3)
# theater_module.price_morning(4)
# theater_module.price_soldier(5)
# import theater_module as mv
# mv.price_soldier(5)

# from theater_module import *

#import travel.thailand
# from travel.thailand import TailandPackage
# trip_to = TailandPackage()
# trip_to.detail()

# from travel import vietnam
# trip_to = vietnam.VietnamPackage()
# trip_to.detail()

#from random import *
# from travel import *
# # trip_to = vietnam.VietnamPackage()
# # trip_to1 = thailand.TailandPackage()
# # trip_to.detail()
# # trip_to1.detail()

# import inspect
# import random
# print(inspect.getabsfile(random))
# print(inspect.getabsfile(thailand))

# from bs4 import BeautifulSoup
# soup = BeautifulSoup("<p>Some<b>bad<i>HTML")
# print(soup.prettify())

# print(dir())

# import glob
# print(glob.glob("*.py"))
# import os
# print(os.getcwd())

# folder = "sample_dir"

# if os.path.exists(folder):
#     print("이미 존재하는 폴더")
#     os.rmdir(folder)
#     print(folder, "폴더를 삭제")
# else:
#     os.makedirs(folder)
#     print(folder, "폴더를 생성")

# import time

# print(time.localtime())
# print(time.strftime("%Y-%m-%d %H:%M:%S"))

# import datetime
# today= datetime.date.today()
# td=datetime.timedelta(days=100)
# print("우리가 만난지 100일", today+td)

# import byme
# byme.sign()

