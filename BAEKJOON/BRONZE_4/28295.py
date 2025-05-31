d=0
for _ in range(10):
  d += 90*int(input())
d %= 360
if d == 0:
  print('N')
elif d == 90:
  print('E')
elif d == 180:
  print('S')
elif d == 270:
  print('W')