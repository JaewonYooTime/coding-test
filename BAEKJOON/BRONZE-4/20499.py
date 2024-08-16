import sys
K,D,A = map(int, sys.stdin.readline().rstrip().split('/'))
if K+A<D or D==0:
  print('hasu')
else:
  print('gosu')