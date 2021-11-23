import pyautogui

# fw = pyautogui.getActiveWindow()            # 현재 활성화된 창
# print(fw.title)                             # 활성화 되어있는 창의 정보
# print(fw.size)                              # 활성화 된 창의 크기 정보
# print(fw.left, fw.top, fw.right, fw.bottom) # 창의 좌표 정보

# pyautogui.click(fw.left+10, fw.top+20)      # 활성화 된 창 내에서의 이동

# for w in pyautogui.getAllWindows():          # 모든 윈도우 가져오기
#         print(w)                             # 모든 윈도우 가져오기

# for w in pyautogui.getWindowsWithTitle("제목 없음"):
#     print(w)

w = pyautogui.getWindowsWithTitle("제목 없음")[0]
print(w)

if w.isActive == False:   # 해당 조건의 윈도우가 활성화되지 않았다면
    w.activate()          # 활성화 (맨 앞으로 가져오기)

if w.isMaximized == False:  # 해당 조건의 윈도우가 최대화되지 않았다면
    w.maximize()            # 최대화

# if w.isMinimized == False:  # 해당 조건의 윈도우가 최소화되지 않았다면
#     w.minimize()            # 최소화


pyautogui.sleep(3)
w.restore() # 화원 원래상태로

w.close() # 윈도우 닫기