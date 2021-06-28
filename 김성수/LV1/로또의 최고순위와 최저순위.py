def solution(lottos, win_nums):
    answer = []
    z_c = lottos.count(0)
    correct = set(lottos) & set(win_nums)
    max_correct = z_c + len(correct)
    min_correct = len(correct)
    li1 = [max_correct,min_correct]
    for i in li1:
        if i < 2:
            answer.append(6)
        elif i==2:
            answer.append(5)
        elif i ==3:
            answer.append(4)
        elif i ==4:
            answer.append(3)
        elif i ==5:
            answer.append(2)
        elif i ==6:
            answer.append(1)
    return answer



lottos = [45, 4, 35, 20, 3, 9]
win_nums =[20, 9, 3, 45, 4, 35]

print(solution(lottos,win_nums))