# 0의 개수와 고른숫자 개수 
# 고른숫자가 일치하는 개수 찾기
def solution(lottos, win_nums):
    answer = []
    count_0 = 0
    count_win = 0
    for e in lottos:
        if e == 0:
            count_0 += 1
    for i in lottos:
        for j in win_nums:
            if i == j:
                count_win += 1
                break
    # 최고등수
    if count_win+count_0 == 6:
        answer.append(1)
    elif count_win+count_0 == 5:
        answer.append(2)
    elif count_win+count_0 == 4:
        answer.append(3)
    elif count_win+count_0 == 3:
        answer.append(4)
    elif count_win+count_0 == 2:
        answer.append(5)
    else:
        answer.append(6) 
    
    # 최저등수
    if count_win == 6:
        answer.append(1)
    elif count_win == 5:
        answer.append(2)
    elif count_win == 4:
        answer.append(3)
    elif count_win == 3:
        answer.append(4)
    elif count_win == 2:
        answer.append(5)
    else:
        answer.append(6)
    return answer