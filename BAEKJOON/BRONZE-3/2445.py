from sys import stdin
N = int(stdin.readline())
li = []
for i in range(0,N):
  str = ' '*i + '*'*(N*2 - 2*i-1)
  print(str)
for i in range(N-2,-1,-1):
  str = ' '*i + '*'*(N*2 - 2*i-1)
  print(str)