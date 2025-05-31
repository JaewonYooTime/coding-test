A, B = map(int, input().split())
Atype = A%4
Btype = B%4
Atype = 4 if Atype==0 else Atype
Btype = 4 if Btype==0 else Btype
dif = abs(Atype-Btype)
if Atype > Btype:
  B += dif
elif Atype < Btype:
  A += dif
print(abs(A-B)//4 + dif)
