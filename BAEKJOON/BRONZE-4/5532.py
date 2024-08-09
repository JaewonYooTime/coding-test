L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

import math
if A/C > B/D :
  print(
    L - math.ceil((A/C))
    )
else:
  print(
    L - math.ceil((B/D))
    )