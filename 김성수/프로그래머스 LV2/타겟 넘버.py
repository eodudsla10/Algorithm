# 타겟 넘버
# DFS 사용하여 모든 경우의 수를 구했다.
answer = 0
def solution(numbers, target):
    global answer
    dfs(0,numbers,target,0)
    return answer

def dfs(indx , numbers, target, value):
    global answer 
    if indx == len(numbers) and target == value:
        answer +=1
        return 
    if indx == len(numbers):
        return 
    dfs(indx+1,numbers,target,value+numbers[indx])
    dfs(indx+1,numbers,target,value-numbers[indx])


numbers =[1, 1, 1, 1, 1]
target = 3


# 다른 사람 풀이
def solution(numbers, target):
    if not numbers and target == 0 :
        return 1
    elif not numbers:
        return 0
    else:
        return solution(numbers[1:], target-numbers[0]) + solution(numbers[1:], target+numbers[0])


print(solution(numbers,target))