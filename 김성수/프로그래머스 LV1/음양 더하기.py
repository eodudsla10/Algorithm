def solution(absolutes, signs):
    answer = 0
    for a , s in zip(absolutes,signs):
        if s :
            answer+=a
        else:
            answer-=a

    return answer



absolutes = [4,7,12]	
signs = [True,False,True]	