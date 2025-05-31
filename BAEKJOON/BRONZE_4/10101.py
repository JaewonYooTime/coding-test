d1 = int(input())
d2 = int(input())
d3 = int(input())

if d1 == d2 and d2 == d3 and d3 == d1:
  print('Equilateral')
elif sum([d1,d2,d3]) == 180 and (d1 == d2 or d2 == d3 or d3 == d1):
  print('Isosceles')
elif sum([d1,d2,d3]) == 180 and (d1 != d2 and d2 != d3 and d3 != d1):
  print('Scalene')
elif sum([d1,d2,d3]) != 180:
  print('Error')