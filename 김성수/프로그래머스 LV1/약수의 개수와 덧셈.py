def solution(left, right):
    answer = 0
    for i in range(left,right+1):
        count = 0
        n = i 
        약수 =i
        while True:
            if n%약수==0:
                count+=1
            if 약수 <=1:
                break
            약수 -=1
        if count%2==0:
            answer+=n
        else:
            answer-=n
    return answer




left = 13
right = 17

print(solution(left,right))

####### 
##다른 사람 풀이
# 약수의 개수가 짝수개인지 홀수개인지는 제곱근을 구하면 알수 있다 
import math

def solution(left, right):
    answer = 0
    for i in range(left, right + 1, 1):
        sqrt = math.sqrt(i) 
        ## 제곱근이 정수 2 
        if int(sqrt) == sqrt:
            answer -= i
        ## 제곱근이 1.234
        else:
            answer += i

    return answer

