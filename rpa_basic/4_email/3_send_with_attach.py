import smtplib
from account import *
from email.message import EmailMessage

msg = EmailMessage()
msg["Subject"] = "테스트 메일 입니다." # 제목
msg["From"] = EMAIL_ADDRESS          # 보내는 사람
msg["To"] = "dnjsalsl9182@naver.com" # 받는 사람
msg.set_content("다운로드ㄱㄱ") # 본문

# MIME type 
# https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types
# https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
# msg.add_attachment()
"""
확장자	문서 종류	MIME 타입
.aac	AAC 오디오 파일	audio/aac
.abw	AbiWord 문서	application/x-abiword
.arc	아카이브 문서 (인코딩된 다중 파일)	application/octet-stream
.avi	AVI: Audio Video Interleave	video/x-msvideo
.azw	아마존 킨들 전자책 포맷	application/vnd.amazon.ebook
.bin	모든 종류의 이진 데이터	application/octet-stream
.bz	BZip 아카이브	application/x-bzip
.bz2	BZip2 아카이브	application/x-bzip2
.csh	C-Shell 스크립트	application/x-csh
.css	Cascading Style Sheets (CSS)	text/css
.csv	Comma-separated values (CSV)	text/csv
.doc	Microsoft Word	application/msword
.epub	Electronic publication (EPUB)	application/epub+zip
.gif	Graphics Interchange Format (GIF)	image/gif
.htm
.html	HyperText Markup Language (HTML)	text/html
.ico	Icon 포맷	image/x-icon
.ics	iCalendar 포맷	text/calendar
.jar	Java 아카이브 (JAR)	application/java-archive
.jpeg
.jpg	JPEG 이미지	image/jpeg
.js	JavaScript (ECMAScript)	application/js
.json	JSON 포맷	application/json
.mid
.midi	Musical Instrument Digital Interface (MIDI)	audio/midi
.mpeg	MPEG 비디오	video/mpeg
.mpkg	Apple Installer Package	application/vnd.apple.installer+xml
.odp	OpenDocuemnt 프리젠테이션 문서	application/vnd.oasis.opendocument.presentation
.ods	OpenDocuemnt 스프레드시트 문서	application/vnd.oasis.opendocument.spreadsheet
.odt	OpenDocument 텍스트 문서	application/vnd.oasis.opendocument.text
.oga	OGG 오디오	audio/ogg
.ogv	OGG 비디오	video/ogg
.ogx	OGG	application/ogg
.pdf	Adobe Portable Document Format (PDF)	application/pdf
.ppt	Microsoft PowerPoint	application/vnd.ms-powerpoint
.rar	RAR 아카이브	application/x-rar-compressed
.rtf	Rich Text Format (RTF)	application/rtf
.sh	Bourne 쉘 스크립트	application/x-sh
.svg	Scalable Vector Graphics (SVG)	image/svg+xml
.swf	Small web format (SWF) 혹은 Adobe Flash document	application/x-shockwave-flash
.tar	Tape Archive (TAR)	application/x-tar
.tif
.tiff	Tagged Image File Format (TIFF)	image/tiff
.ttf	TrueType Font	application/x-font-ttf
.vsd	Microsft Visio	application/vnd.visio
.wav	Waveform Audio Format	audio/x-wav
.weba	WEBM 오디오	audio/webm
.webm	WEBM 비디오	video/webm
.webp	WEBP 이미지	image/webp
.woff	Web Open Font Format (WOFF)	application/x-font-woff
.xhtml	XHTML	application/xhtml+xml
.xls	Microsoft Excel	application/vnd.ms-excel
.xml	XML	application/xml
.xul	XUL	application/vnd.mozilla.xul+xml
.zip	ZIP archive	application/zip
.3gp	3GPP 오디오/비디오 컨테이너	video/3gpp
audio/3gpp if it doesn't contain video
.3g2	3GPP2 오디오/비디오 컨테이너	video/3gpp2
audio/3gpp2 if it doesn't contain video
.7z	7-zip 아카이브	application/x-7z-compressed
"""

with open("시가총액1-200.csv", "rb") as f:
    msg.add_attachment(f.read(), maintype="text", subtype="csv", filename=f.name)

with open("daum.png", "rb") as f:
    msg.add_attachment(f.read(), maintype="image", subtype="png", filename=f.name)


with smtplib.SMTP("smtp.gmail.com", 587) as smtp:
    smtp.ehlo()
    smtp.starttls()
    smtp.login(EMAIL_ADDRESS, EMAIL_PASSWORD)
    smtp.send_message(msg)
