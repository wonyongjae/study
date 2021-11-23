import pyautogui

# 절대좌표 마우스 이동 - 전체화면을 기준으로 절대좌표
# pyautogui.moveTo(200, 100) # 지정한 위치(가로 x, 세로 y)로 마우스를 이동
# pyautogui.moveTo(100, 200, duration=5) # 5초 동안 100, 200 위치로 이동 

# pyautogui.moveTo(100, 100, duration=0.25)
# pyautogui.moveTo(200, 200, duration=0.25)
# pyautogui.moveTo(300, 300, duration=0.25)


# 상대좌표 마우스 이동 - 마우스 위치 기준으로 상대좌표
# pyautogui.moveTo(100, 100, duration=0.25) # 전체화면을 기준으로 절대좌표
# print(pyautogui.position()) # Point(x,y)
# pyautogui.move(100, 100, duration=0.25) # 마우스 위치 기준으로 상대좌표
# print(pyautogui.position()) # Point(x,y)
# pyautogui.move(100, 100, duration=0.25) # 마우스 위치 기준으로 상대좌표
# print(pyautogui.position()) # Point(x,y)

p = pyautogui.position()
print(p[0],p[1]) # x, y
print(p.x,p.y)   # x, y