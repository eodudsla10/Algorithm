## 시저 암호
## ord를 사용해서 아스키코드 값으로 변환후 증가
def solution(s, n):
    answer = ''
    for st in s:
        if st == ' ':
            answer+=st
        elif 'a'<= st <='z':
            if ord(st)+n > ord('z'):
                answer +=chr(ord(st)+n-26)
            else:
                answer +=chr(ord(st)+n)
        elif 'A'<= st <='Z':
            if ord(st)+n > ord('Z'):
                answer +=chr(ord(st)+n-26)
            else:
                answer +=chr(ord(st)+n)
    
    return answer


s = "a B z"
n=4
print(solution(s,n))