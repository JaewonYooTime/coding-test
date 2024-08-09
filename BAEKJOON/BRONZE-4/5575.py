l1 = list(map(int, input().split()))
l2 = list(map(int, input().split()))
l3 = list(map(int, input().split()))


def cal_t(li):
  h = li[3]-li[0]
  m = li[4]-li[1]
  s = li[5]-li[2]
  if s < 0:
    s += 60
    m -= 1
  if m < 0:
    m += 60
    h -= 1
  print(h,m,s)


cal_t(l1)
cal_t(l2)
cal_t(l3)