n = input()
if len(n) == 2:		#둘 다 10이 아님
    print(sum(map(int, [n[0], n[1]])))
elif len(n) == 4:	#둘 다 10
    print(20)
else:			#둘 중 하나가 10
    if int(n[-1]) == 0:		#문자열의 맨 마지막이 0, 즉 B가 10이다
        print(int(n[0]) + 10)
    else:			#중간이 0, 즉 A가 10이다
        print(int(n[-1]) + 10)