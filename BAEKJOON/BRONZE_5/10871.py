N, X = map(int,input().split())
A = list(map(int, input().split()))
for i in range(len(A)):
  if X > A[i] :
    print(A[i], end=' ')
