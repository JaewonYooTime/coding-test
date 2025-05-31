li = ['a','e','i','o','u']
while(1):
  count = 0
  str = input().lower()
  if str == '#':
    break
  for ch in str:
    if ch in li:
      count += 1
  print(count)
