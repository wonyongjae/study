# pip install openpyxl
# 라이브러리 설치

from openpyxl import Workbook
wb = Workbook() # 새 워크북 생성
ws = wb.active # 현재 활성화된 sheet 가져오기
ws.title = "dydwosheet" # sheet 이름 변경
wb.save("sample.xlsx")  # excel file 생성
wb.close()