li = []
for _ in range(5):
  li.append(sum(list(map(int, input().split()))))
print(li.index(max(li))+1, max(li))