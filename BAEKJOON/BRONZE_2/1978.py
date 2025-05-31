N = int(input())
li = list(map(int, input().split()))
num = 0
for i in li:
  if i == 1:
    continue
  elif i == 2:
    num += 1  
  else:
    rem = 0
    for j in range(2, i):
      # 자기 자신을 제외한 값으로 나눌 때 나머지 0일 경우
      if i%j == 0: 
        rem += 1 # 소수에서 탈락
      # 자기 자신 외에 나눠지는 값이 없는 경우에만 소수 카운트 추가
    if rem == 0:
     num += 1
print(num)