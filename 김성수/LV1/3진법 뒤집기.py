def solution(n):
    answer = 0
    global n_3
    notation_3(n)
    n_3.reverse()
    for i,t in enumerate(n_3):
        answer+=(3**i)*t
    return answer

n_3 =[]
#재귀 호출을 이용해 진법 변환
def notation_3(n):
    global n_3
    if n<3:
        n_3.append(1)
        return 
    n_3.append(n%3)
    return notation_3(n//3)

print(solution(45))
