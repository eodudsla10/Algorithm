def solution(numbers):
    from itertools import combinations
    answer = []
    two_num = list(combinations(numbers,2))
    
    for i in two_num :
        x,y = i
        answer.append(x+y)
    
    answer = list(set(answer))
    answer.sort()
    
    return answer