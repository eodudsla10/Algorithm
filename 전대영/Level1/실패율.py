def solution(N, stages):
    answer = []
    number =0
    arrive = len(stages)
    for i in range(1,N+1):
        for j in range(arrive):
            if stages[j] == i:
                number += 1
        if number == 0:
            answer.append(0)
        else:
            answer.append(number/arrive)
            
        arrive = arrive-number
        number = 0

    a=sorted(answer,reverse=True)
    answer2=[]

    for i in range(len(a)):
        answer2.append(answer.index(a[i])+1)
        answer[answer.index(a[i])]=2

    return answer2