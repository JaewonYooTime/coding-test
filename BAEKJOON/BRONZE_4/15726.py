A,B,C = map(int, input().split())
val1 = int(A*B/C)
val2 = int(A/B*C)
print(max(val1, val2))