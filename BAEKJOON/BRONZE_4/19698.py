import sys
N,M,K = map(int, sys.stdin.readline().rstrip().split())
frontO = M
frontX = N-M
backO = K
backX = N-K
print(min(frontO,backO) + min(frontX,backX))