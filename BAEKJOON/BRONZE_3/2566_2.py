# 9x9 행렬 입력 받기
li = [list(map(int, input().split())) for _ in range(9)]

# 2차원 리스트에서 최대값 찾기
max_val = max(max(row) for row in li)

# 최대값의 좌표 찾기
for i, row in enumerate(li):
    if max_val in row:
        row_idx = i
        col_idx = row.index(max_val)
        break

# 결과 출력
print(max_val)
print(row_idx + 1, col_idx + 1)
