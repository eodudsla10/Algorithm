def solution(n):
    n = [i for i in str(n)]
    # print(n)
    n.sort(reverse=True)
    return int(''.join(n))

n = 118372

print(solution(n))