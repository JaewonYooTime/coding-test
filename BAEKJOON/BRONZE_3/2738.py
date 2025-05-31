N, M = map(int, input().split())
A = []
B = []
for _ in range(N):
  A.append(list(map(int, input().split())))
for _ in range(N):
  B.append(list(map(int, input().split())))
S = A
for i in range(N):
  for j in range(M):
    S[i][j] += B[i][j]
    print(S[i][j], end=' ')
  print()