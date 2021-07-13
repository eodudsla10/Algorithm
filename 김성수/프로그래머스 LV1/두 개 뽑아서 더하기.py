from collections import deque

def solution(numbers):
    answer = []
    q = deque()
    q.append(0)
    len1 = len(numbers)
    while q:
        id = q.popleft()
        sum = 0
        for i in range(id+1,len1):
            sum = numbers[id]+numbers[i]
            if sum not in answer:
                answer.append(sum)
        id +=1
        if id < len1:
            q.append(id)
    answer.sort()
    return answer

numbers = [2,1,3,4,1]
result = [2,3,4,5,6,7]

print(solution(numbers))