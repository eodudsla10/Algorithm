def solution(arr, divisor):
    answer = []
    for a in arr:
        if a % divisor == 0:
            answer.append(a)
            answer.sort()
    if answer == []:
        answer.append(-1)

    return answer
#한 줄 코딩
#sorted 이용
#앞 조건이 거짓일 때 or 뒤가 호출된다(-1)
# def solution(arr, divisor): return sorted(n for n in arr if n%divisor ==0) or [-1]

#실행 값
arr = [5,9,7,10]
print(solution(arr,5))
