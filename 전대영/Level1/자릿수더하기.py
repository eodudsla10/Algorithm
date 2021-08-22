#방법1
def solution(n):
    answer = 0
    while n>0:
        answer += n%10  # 입력받은 n을 10을 나눈 나머지를 answer에 넣는다
        n = n//10 #10을 나눈 다음에 정수 부분만 n에 넣는다

    print('Hello Python')

    return answer

# 방법2
# map 함수 사용
def sum_digit(number):
    '''number의 각 자릿수를 더해서 return하세요'''
    return sum(map(int,str(number)))

# 아래는 테스트로 출력해 보기 위한 코드입니다.
print("결과 : {}".format(sum_digit(123)))