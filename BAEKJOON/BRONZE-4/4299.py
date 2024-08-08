sm, sb = map(int, input().split())
a = (sm + sb)//2
b = sm - a
if (sm + sb < 0) or (sm - sb < 0) or a < 0 or b < 0:
  print('-1')
else:
  print(max([a,b]), min([a,b]))