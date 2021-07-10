def solution(arr):
    answer = []
    num = arr[0]
    answer.append(num)
    for i in range(1,len(arr)):
        if arr[i] != num:
            answer.append(arr[i])
        num = arr[i]
    return answer

arr = [1,1,3,3,0,1,1]

print(solution(arr))