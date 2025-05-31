N = int(input())
for i in range(N):
  print(f"{' '*(N-i-1) + '*'*(2*i+1)}")