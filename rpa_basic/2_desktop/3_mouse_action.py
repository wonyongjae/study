import pyautogui
# pyautogui.sleep(3) # 3초 대기
# print(pyautogui.position())

# pyautogui.click(51, 10, duration=1) # 1초동안 (51,10) 좌표로 이동 후 마우스 클릭
# pyautogui.click()

# 드래그 앤 드롭 할때 사용
# pyautogui.mouseDown() 
# pyautogui.mouseUp()

# pyautogui.doubleClick()      # 더블클릭
# pyautogui.click(clicks=500)  # 횟수 지정 클릭

# pyautogui.moveTo(200, 200)
# pyautogui.mouseDown() # 마우스 누른 상태
# pyautogui.moveTo(300, 300)
# pyautogui.mouseUp() # 마우스 뗀 상태

pyautogui.sleep(3)      # 3초 대기
# pyautogui.rightClick()  # 마우스 오른쪽 클릭
# pyautogui.middleClick() # 휠

# print(pyautogui.position())
# pyautogui.drag(100, 0, duration=0.25) # 너무 빠르면 드래그가 안될 수 있으니 속도를 조금 줄여줌
# pyautogui.moveTo(953, 224)
# pyautogui.drag(100, 0)                   # 마우스 현 위치 기준으로 지정한 상대적 위치만큼 드래그
# pyautogui.dragTo(1514, 349, duration=0.25) # 마우스 현 위치에서 지정한 절대적 위치만큼 드래그

#pyautogui.scroll(300) # 위 방향으로 300만큼 스크롤(양수면 위, 음수면 아래)
pyautogui.scroll(-800) # -300 아래 방향으로 300만큼 스크롤