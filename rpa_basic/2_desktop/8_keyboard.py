import pyautogui
# Automatetheboringstuff.comm
# https://automatetheboringstuff.com/
# pip install pyperclip 한글 입력 가능하게 해줌
import pyperclip
pyperclip.copy("용재짱")

w = pyautogui.getWindowsWithTitle("제목 없음")[0] # 제목 없음 이라는 윈도우 중에서 첫번째
w.activate()
pyautogui.hotkey("ctrl","v")    # 위의 pyperclip.copy("용재짱") 에서 "용재짱"을 복붙함

def my_write(text):
    pyperclip.copy(text)
    pyautogui.hotkey("ctrl","v")

my_write("용재는 짱짱맨")

# 자동화 프로그램 강제종료
# win : ctrl + alt + del
# mac : cmd + shift + option + q


# pyautogui.write("12345")
# pyautogui.write("dydwosjanajtwu", interval=0.2)
# pyautogui.write("용재짱")

# pyautogui.write(["t","e","s","t","left","left","right","l","a","enter"], interval=0.2)
# t e s t 순서대로 입력 후 커서가 왼쪽으로 2번, 오른쪽으로 1번, l a 를 마저 입력 후 enter로 줄바꿈

# 특수 문자
# shift 4 -> $
# pyautogui.keyDown("shift") # shift 키를 누른 상태로 유지
# pyautogui.press("4")       # 숫자 5를 입력
# pyautogui.keyUp("shift")   # shift 키를 뗀다

# 조합키 (Hot key)
# pyautogui.keyDown("ctrl")
# pyautogui.keyDown("a")
# pyautogui.keyUp("a")        
# pyautogui.keyUp("ctrl")

# 간편한 조합키
#pyautogui.hotkey("ctrl", "alt", "shift", "a")
# Ctrl 누르고 > Alt 누르고 > Shift 누르고 > A 누르고 > A 떼고 >shift 떼고 > alt 떼고
