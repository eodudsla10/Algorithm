from itertools import combinations
import math

def solution(nums):
    answer = 0
    #중복되지 않은 3개의 숫자 배열을 생성 
    num_list = list(combinations(nums,3))
    for i , j , k in num_list:
        if isprime(i+j+k):
            answer +=1
    return answer


def isprime(n):
    #제곱근 구하기
    sqrt = math.sqrt(n)
    # 제곱근이 2보다 작으면 소수가 아니다
    if sqrt <2:
        return False
    # 2부터 제곱근 까지의 수로 n을 나눴을 경우 나머지가 0이면 소수가 아니다
    for i in range(2,int(sqrt+1)):
        if n%i == 0:
            return False
    return True


nums = [1,2,3,4]
print(solution(nums))