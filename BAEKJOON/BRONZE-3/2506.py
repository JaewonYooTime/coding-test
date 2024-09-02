N = int(input())
li = list(map(int, input().split()))
li_score = []
for i in range(len(li)):
  if i == 0:
    li_score.append(li[i])
  elif i>0 and li[i] == 0:
    li_score.append(li[i])
  elif i>0 and li[i] != 0:
    li_score.append(li[i]+li_score[i-1])
print(sum(li_score))