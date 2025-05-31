p, q = map(int, input().split())
li = []
for i in range(1,p+1):
  if p%i==0:
    li.append(i)
try:
  print(li[q-1])
except:
  print(0)