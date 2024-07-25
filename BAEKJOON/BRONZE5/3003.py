white_list = list(map(int, input().split()))
ori_list = [1, 1, 2, 2, 2, 8]
str = ''
for i in range(6):
  str += f'{ori_list[i] - white_list[i]} '
print(str.strip())