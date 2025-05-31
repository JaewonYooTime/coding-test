from sys import stdin
str = stdin.readline().rstrip()
if str == 'A+':
  print('4.3')
elif str == 'A0':
  print('4.0')
elif str == 'A-':
  print('3.7')
elif str == 'B+':
  print('3.3')
elif str == 'B0':
  print('3.0')
elif str == 'B-':
  print('2.7')
elif str == 'C+':
  print('2.3')
elif str == 'C0':
  print('2.0')
elif str == 'C-':
  print('1.7')
elif str == 'D+':
  print('1.3')
elif str == 'D0':
  print('1.0')
elif str == 'D-':
  print('0.7')
elif str == 'F':
  print('0.0')