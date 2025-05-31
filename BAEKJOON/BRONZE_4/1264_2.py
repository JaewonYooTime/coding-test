while(1):
  count = 0
  str = input().lower()
  if str == '#':
    break
  for ch in str:
    if ch in 'aeiou':
      count += 1
  print(count)