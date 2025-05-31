N = int(input())
li = list(map(int, input().split()))
T, P = map(int, input().split())
T_set = 0
for i in li:
  if i%T == 0:  
    T_set += int(i/T)
  else:
    T_set += int(i/T) + 1
print(T_set)
print(int(sum(li)/P), sum(li)%P) 

