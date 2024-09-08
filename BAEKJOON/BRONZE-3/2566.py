li = []
for i in range(9):
  li.append(list(map(int, input().split())))

row_idx = 0
col_idx = 0
max_val = -1
for i in range(9):
  for j in range(9):
    if max_val < li[i][j]:
      max_val = li[i][j]
      row_idx = i
      col_idx = j

print(max_val)
print(row_idx+1, col_idx+1)