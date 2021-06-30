from abc import ABCMeta


def solution(lottos, win_nums):
    answer = []
    z_c = lottos.count(0)
    correct = set(lottos) & set(win_nums)
    max_correct = z_c + len(correct)
    min_correct = len(correct)
    li1 = [max_correct,min_correct]
    count_ranc =[6,6,5,4,3,2,1]
    
    return answer



lottos = [45, 4, 35, 20, 3, 9]
win_nums =[20, 9, 3, 45, 4, 35]

print(solution(lottos,win_nums))