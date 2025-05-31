while True:
  str = (input())
  if str == 'END':
    break
  str = list(str)
  str.reverse()
  print(''.join(str))