N = int(input())
li = []
for i in range(N):
  N, str = input().split()
  li.append([int(N), str])
for i in li:
  for j in i[1]:
    print(j*i[0],end='')
  print()