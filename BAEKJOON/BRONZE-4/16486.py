import sys
N = int(sys.stdin.readline().rstrip())
# 1 1
# 2 2
# 3 3
# 4 4
# 5 5
# 6 4
# 7 3
# 8 2
N = N % 8
if N == 1:
  print(1)
elif N in [2,0]:
  print(2)
elif N in [3,7]:
  print(3)
elif N in [4,6]:
  print(4)
elif N == 5:
  print(5)
# count = 1
# finger = 1
# while(True):
#   if count == N :
#     break
#   if finger == 1:
#     dir = True
#   elif finger == 5:
#     dir = False
#   if dir:
#     count += 1
#     finger += 1
#   else:
#     count += 1
#     finger -= 1
# print(finger)