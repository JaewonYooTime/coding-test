N = int(input())
str = input()
while str.count('s') != str.count('t')  :
  str = str[1:]
print(str)