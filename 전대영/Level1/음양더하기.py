def solution(absolutes, signs):
    answer = 0
    for x , y in zip(absolutes,signs):
        if y == False:
            x = -x
        answer += x

    return answer

absolutes = [4,7,12]
signs = [True,False,True]
print(solution(absolutes,signs))