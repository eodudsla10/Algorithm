# 유클리드 호제법으로 최대공약수를 구한 후
# 두 자연수의 곱을 최대공약수로 나눠 최소공배수를 구했다
# 유클리드 호제법은 재귀함수를 이용해서 구현했다.
def solution(n, m):
    answer = []
    def gcd(n,m):
        if not n%m:
            return m
        else:
            return gcd(m,n%m)
    answer.append(gcd(n,m))
    answer.append(int((n*m)/answer[0]))
    return answer


print(solution(72,30))