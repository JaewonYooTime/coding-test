# 1부터 30까지의 학생 번호 리스트에서 제출한 학생 번호를 제거
students = set(range(1, 31))

# 입력으로 주어진 28명의 출석번호를 set에서 제거
for _ in range(28):
    students.remove(int(input()))

# 남은 두 번호를 오름차순으로 출력
missing_students = sorted(students)
print(missing_students[0])
print(missing_students[1])