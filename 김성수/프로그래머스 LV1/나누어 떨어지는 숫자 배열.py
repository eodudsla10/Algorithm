def solution(arr, divisor):
    answer = []
    arr.sort()
    for i in arr:
        if not i%divisor:
            answer.append(i)
    if not answer:
        answer.append(-1)
    return answer

arr = [5, 9, 7, 10]	
divisor = 5

print(solution(arr,divisor))