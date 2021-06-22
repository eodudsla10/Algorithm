def solution(s):
    answer = True
    count_p = 0
    count_y = 0
    S = s.lower()
    for i in S:
        if i == 'p':  # p의 개수 세기
            count_p += 1
        elif i == 'y':  # y의 개수 세기
            count_y += 1
    if count_p != count_y: # 개수다르면 False
        answer = False

    return answer