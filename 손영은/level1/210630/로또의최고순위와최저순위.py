def solution(lottos, win_nums):
    result = [6,5,4,3,2,1]
    count = 0
    zerocount = lottos.count(0)
    for number in lottos:
        if number in win_nums:
            count += 1
    return result[count+zerocount], result[count]