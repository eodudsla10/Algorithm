def solution(n):
    answer = []
    n_list = list(map(int, str(n)))
    answer = n_list[::-1]

    return answer

n=12345
print(solution(n))