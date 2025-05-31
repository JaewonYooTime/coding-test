li1 = []
li1.append(int(input())) 
li1.append(int(input())) 
li1.append(int(input())) 
li1.append(int(input())) 
li1.sort(reverse=True)

li2 = []
li2.append(int(input())) 
li2.append(int(input())) 
li2.sort(reverse=True)
print(sum(li1[:3]) + li2[0])