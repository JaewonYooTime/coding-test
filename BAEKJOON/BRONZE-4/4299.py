sm, sb = map(int, input().split())
if ((sm + sb) % 2 != 0) or (sm < sb):
  print('-1')
else:
  a = (sm + sb)//2
  b = sm - a
  print(max([a,b]), min([a,b]))