import pyautogui

# 좌표가 아닌 이미지로 위치를 찾아 클릭
# 전체 화면에서 지정한 이미지 파일과 똑같은 부분을 찾으면 해당 위치의 좌표를 가져옴

# file_menu = pyautogui.locateOnScreen("file_menu.png")
# print(file_menu)
# pyautogui.click(file_menu)

# trash_icon = pyautogui.locateOnScreen("trash_icon.png")
# pyautogui.moveTo(trash_icon)

# 이미지를 못 찾을 경우 None 출력
# screen = pyautogui.locateOnScreen("screenshot.png")
# print(screen)

# 같은 이미지가 여러개 있을 경우 for문 + locateAllOnScreen을 이용
# for i in pyautogui.locateAllOnScreen("checkbox.png"):
#     print(i)
#     pyautogui.click(i)

# checkbox = pyautogui.locateOnScreen("checkbox.png")
# pyautogui.click("checkbox.png")

from PIL.ImageOps import grayscale

# pyautogui.mouseInfo()



# 속도 개선
# pip install opencv-python

# 1. grayscale
# file_icon = pyautogui.locateOnScreen("file_menu.png", grayscale=True)
# pyautogui.moveTo(file_icon)

# 2. region (범위지정)
# file_icon = pyautogui.locateOnScreen("file_menu.png", region=(54, 20, 54-168, 20-94))
# pyautogui.moveTo(file_icon)

# 3. 정확도 조정
# run_btn = pyautogui.locateOnScreen("file_menu.png", confidence=0.9) # 정확도 90%
# pyautogui.moveTo(run_btn)



# 자동화 대상이 보여지지 않는 경우

# 1. 계속 기다리기
# file_menu_notepad = pyautogui.locateOnScreen("file_menu_notepad.png")
# if file_menu_notepad:
#     pyautogui.click(file_menu_notepad)
# else:
#     print("발견 실패")

# while file_menu_notepad is None:
#     file_menu_notepad = pyautogui.locateOnScreen("file_menu_notepad.png")
#     print("발견 실패")
# pyautogui.click(file_menu_notepad)



# 2. 일정 시간동안 기다리기 (TimeOut)
import time
import sys

# timeout = 10                         # 10초 대기
# start = time.time()                  # 시작 시간 설정
# file_menu_notepad = None
# while file_menu_notepad is None:
#     file_menu_notepad = file_menu_notepad = pyautogui.locateOnScreen("file_menu.png")
#     end = time.time()                # 종료 시간 설정
#     if end - start > timeout:        # 지정한 10초를 초과하면
#         print("시간초과")
#         sys.exit()





def find_target(img_file, timeout=30):
    start = time.time()
    target = None
    while target is None:
        target = pyautogui.locateOnScreen(img_file)
        end = time.time()
        if end - start > timeout:
            break
    return target

def my_click(img_file, timeout=30):
    target = find_target(img_file, timeout)
    if target:
        pyautogui.click(target)
    else:
        print("f[Timeout {timeout}s] Target not found ({img_file}). Terminate program.")
        sys.exit()

my_click("file_menu.png", 10)