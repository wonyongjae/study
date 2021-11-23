import pyautogui

# 스크린 샷 찍기

# img = pyautogui.screenshot()
# img.save("screenshot.png") # 파일 저장

# pyautogui.mouseInfo()
# 24,17 49,164,240 #31A4F0

pixel = pyautogui.pixel(24, 17)
print(pixel)

# print(pyautogui.pixelMatchesColor(24, 17, (49,164,240)))
print(pyautogui.pixelMatchesColor(24, 17, (49,164,243)))

# 활용 ex ) 화면의 변화에 따른 픽셀변화를 확인하여 다음 작업 or 에러 메시지 출력
