A,B = map(int, input().split())
a = 100 - A
b = 100 - B
c = 100 - (a + b)
d = a * b
q = d // 100
r = int(d % 100)
print(a,b,c,d,q,r)
print(c+q,r)