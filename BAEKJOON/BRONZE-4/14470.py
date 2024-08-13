A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())
time = 0
frozen = False
if A < 0:
  frozen = True
while True :
  if frozen == True:
    time += C
    A += 1
  if A == 0 :
    time += D
    frozen = False
  if frozen == False :
    time += E
    A += 1
  if A == B:
    break
print(time)