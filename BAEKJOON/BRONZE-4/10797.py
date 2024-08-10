num = int(input())
li = list(map(int, input().split()))
count = 0
for i in li:
  if (num == i):
    count += 1
print(count)