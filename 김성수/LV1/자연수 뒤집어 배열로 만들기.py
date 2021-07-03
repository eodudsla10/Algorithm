def solution(n):
    answer = []
    sn = str(n)
    for i in sn[-1::-1]:
        answer.append(int(i))
    return answer

print(solution(12345))