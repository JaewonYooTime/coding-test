N = int(input())
pos = 1
for i in range(N):
  X,Y = map(int, input().split())
  if X == pos:
    pos = Y
  elif Y == pos:
    pos = X
print(pos)
 