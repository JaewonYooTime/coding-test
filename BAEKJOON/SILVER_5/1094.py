x = int(input())
n = 64
count = 0
while x > 0:
  if n > x:
    n = n // 2
  elif n <= x:
    x -= n
    count += 1
print(count)
