def solution(n):
    answer = 0

    for i in str(n):  # 문자열로 바꿔서 
        answer += int(i)  # 각자리 수 합 구함

    return answer