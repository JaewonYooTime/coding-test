li = []
for i in range(9):
  val = int(input())
  li.append(val)
max_val = max(li)
max_idx = li.index(max_val)
print(max_val)
print(max_idx+1)