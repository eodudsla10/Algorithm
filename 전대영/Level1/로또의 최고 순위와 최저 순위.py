def solution(lottos, win_nums):
    answer = []
    high_score = 0
    low_score = 0
    # lottos.sort()
    # win_nums.sort()
    for x in range (len(lottos)):
        for y in range (len(win_nums)):
            if lottos[x] == win_nums[y]:
                high_score +=1
            elif lottos[x] == 0:
                low_score +=1
                break
    if high_score+low_score == 6:
        answer.append(1)
    elif high_score+low_score == 5:
        answer.append(2)
    elif high_score+low_score == 4:
        answer.append(3)
    elif high_score+low_score == 3:
        answer.append(4)
    elif high_score+low_score == 2:
        answer.append(5)
    else:
        answer.append(6) 

    if high_score == 1:
        answer.append(6)
    elif high_score ==2:
        answer.append(5)
    elif high_score ==3:
        answer.append(4)
    elif high_score ==4:
        answer.append(3)
    elif high_score ==5:
        answer.append(2)
    elif high_score ==6:
        answer.append(1)
    else:
        answer.append(6)
    
    

    return answer

lottos = [44, 1, 0, 0, 31, 25]
win_nums = [31, 10, 45, 1, 6, 19]
print(solution(lottos,win_nums))