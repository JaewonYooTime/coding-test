import sys
N,W,H,L = map(int, sys.stdin.readline().rstrip().split()) 
print(min(N, int(W/L) * int(H/L)))