def solution(d, budget):
    answer = 0
    d.sort()
    for i in d : 
        if budget < i :
            break
        budget -=i
        answer +=1
    return answer

d = [2,2,3,3]	
budget = 10

print(solution(d,budget))