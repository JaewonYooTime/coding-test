h,m,s = map(int, input().split())
D = int(input())

h += D//3600
D %= 3600
if h >= 24:
  h %= 24

m += D//60
D %= 60
if m >= 60:
  h += 1
  m -= 60

s += D
if s >= 60:
  m += 1
  s -= 60

print(f'{h} {m} {s}')