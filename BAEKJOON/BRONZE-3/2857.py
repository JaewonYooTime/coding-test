call = False
for i in range(5):
  str = input()
  if 'FBI' in str:
    print(i+1, end=' ')
    call = True
if call == False:
  print('HE GOT AWAY!')