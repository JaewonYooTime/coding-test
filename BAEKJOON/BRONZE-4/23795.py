sum = 0
import sys
while True:
  n = int(sys.stdin.readline())
  if n == -1 :
     break
  sum += n
print(sum)