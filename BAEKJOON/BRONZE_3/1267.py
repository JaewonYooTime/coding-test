N = int(input())
li = list(map(int, input().split()))

Y = 0
M = 0
for i in li:
  Y += (1 + (i // 30)) * 10
  M += (1 + (i // 60)) * 15

if Y == M :
  print('Y M', Y)
elif Y < M :
  print('Y', Y)
else:
  print('M', M)
  