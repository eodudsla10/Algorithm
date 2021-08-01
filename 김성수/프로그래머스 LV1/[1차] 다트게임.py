def solution(dartResult):
    point = []
    answer = []
    ##핵심 10 골라내기 
    dartResult = dartResult.replace('10','k')
    point = ['10' if i == 'k' else i for i in dartResult]
    print(point)
    print("1","2", end=" ")
    i = -1
    sdt = ['S', 'D', 'T']
    for j in point:
        if j in sdt :
            answer[i] = answer[i] ** (sdt.index(j)+1)
        elif j == '*':
            answer[i] = answer[i] * 2
            if i != 0 :
                ## 핵심 직전 값 곱하기 2 
                answer[i - 1] = answer[i - 1] * 2
        elif j == '#':
            answer[i] = answer[i] * (-1)
        else:
            ## 핵심 
            answer.append(int(j))
            i += 1
    return sum(answer)


dartResult = '1S*2T*3S'
print(solution(dartResult))