N = int(input())
str = input()
res = 0
for i in str[:N]:
  res += int(i)
print(res)