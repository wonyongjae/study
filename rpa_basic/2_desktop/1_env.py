# pip install pyautogui
# 디스크탑에서 GUI를 이용하는 모듈
import pyautogui

size = pyautogui.size() # 현재 화면의 스크린 사이즈를 가져옴
print(size) # 가로, 세로 크기를 알려줌
# size[0] : width
# size[1] : height