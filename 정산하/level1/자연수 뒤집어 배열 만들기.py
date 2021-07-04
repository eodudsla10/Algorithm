def solution(n):
    answer = []
    t = 0
    temp = n
    while n >= 10**t:
        t += 1
    for i in range(t):
        answer.append(temp%10)
        temp -= temp%10
        temp = temp/10
    return answer