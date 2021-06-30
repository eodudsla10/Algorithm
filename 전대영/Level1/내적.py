def solution(a, b):
    answer = 0
    for x ,y in zip(a,b):
        answer += x*y
        

    return answer

a = [1,2,3,4]
b = [-3,-1,0,2]
print(solution(a,b))

# print(list(zip(a, b)))