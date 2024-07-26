while 1 :
  n = int(input())
  sum = 0
  if n == 0:
    break
  while n > 0 :
    sum += n
    n -= 1
  print(sum)