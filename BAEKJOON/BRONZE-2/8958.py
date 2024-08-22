N = int(input())
for _ in range(N):
  str = input()
  stack = 0
  result = 0
  for i in str:
    if i == 'O':
      stack += 1
      result += stack
    else :
      stack = 0
  print(result)