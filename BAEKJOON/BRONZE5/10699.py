from datetime import datetime, timedelta, timezone
# UTC+9 시간대 정의 (한국 표준시)
kst = timezone(timedelta(hours=9))
# 현재 서울 시간 가져오기
seoul_now = datetime.now(kst)
# 연월일만 추출
current_date = seoul_now.date()
# 출력
print(current_date)