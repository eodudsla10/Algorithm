## 124 나라의 숫자
def solution(n):
    if n<=3:
        return '124'[n-1]
    else:
        q, r = divmod(n-1, 3)
        return solution(q) + '124'[r]

## 3으로 나눴을 때 나머지가 1이면 1, 나머지가 2면 2 , 나머지가 0(즉, 3의 배수)이면 4
## 즉 3진법 
## 콜백 함수 (거꾸로 올라가기)

print(solution(16))