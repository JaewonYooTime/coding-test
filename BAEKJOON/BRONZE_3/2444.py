from sys import stdin
N = int(stdin.readline())
for i in range(N):
  print(f"{' '*(N-i-1) + '*'*(2*i+1)}")
for i in range(N-2,-1,-1):
  print(f"{' '*(N-i-1) + '*'*(2*i+1)}")