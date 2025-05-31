d = int(input())
if d%5 == 0:
  print(f'{d//5}')
elif d%5 > 0:
  print(f'{(d//5)+1}')