A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())
time = 0
while  A < B :
  if A < 0 :
    time += -A * C
    A = 0
  elif A == 0 :
    time += D
    A = 1
  elif A > 0 :
    time += E
    A += 1
print(time)