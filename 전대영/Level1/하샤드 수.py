def solution(arr):
    answer = 0
    for n in str(arr):
        answer += int(n)
    
    if arr % answer == 0:
        return True
    return False

arr =12
print(solution(arr))