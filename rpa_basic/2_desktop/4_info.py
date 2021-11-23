import pyautogui

# pyautogui.mouseInfo()
# 마우스 정보를 가져다줌
# 굳이 print 함수로 마우스 좌표를 찾아다닐 필요가 없어 편함

# pyautogui.FAILSAFE = True

for i in range(10):
    pyautogui.move(100,100)
    pyautogui.PAUSE = 1 # 모든 동작에 1초씩 sleep 적용
    # pyautogui.sleep(1)