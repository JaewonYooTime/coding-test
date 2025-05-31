def in_score():
  val = int(input())
  if val < 40: val = 40
  return val
A = in_score()
B = in_score()
C = in_score()
D = in_score()
E = in_score()

print(f"{(A+B+C+D+E)//5}")