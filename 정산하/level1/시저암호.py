import string   # 알파벳 불러옴
def solution(s, n):
    answer = ''
    for i in s:  # 문자열 하나씩
        # print(i.isupper())
        if i.isupper() == True:  # 대문자일때
            for j in range(26):
                if i == string.ascii_uppercase[j]: # 같을 알파벳 찾으면
                    answer += string.ascii_uppercase[(j+n)%26]  # n번째 후 알파벳
        elif i.islower() == True: # 소문자 일때
            for j in range(26):
                if i == string.ascii_lowercase[j]:
                    answer += string.ascii_lowercase[(j+n)%26]
        else:
            answer += ' '
            
    return answer