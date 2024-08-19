N = int(input())
for i in range(N):
  H,W,N = map(int, input().split())
  F = N % H
  K = (N // H) + 1
  if F == 0:
    K = N // H
    F = H
  print(F*100 + K)