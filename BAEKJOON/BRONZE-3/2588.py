A = int(input())
B = input()
li = []
for i in range(len(B)-1,-1,-1):
  print(A*int(B[i]))
  li.append(A*int(B[i]))
for i in range(len(li)):
  li[i] *= 10**i
print(sum(li))