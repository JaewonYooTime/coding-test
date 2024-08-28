num = 0
li = []
while True:
  a, b = map(int, input().split())
  num += (b-a)
  li.append(num)
  if b == 0:
    break
print(max(li))