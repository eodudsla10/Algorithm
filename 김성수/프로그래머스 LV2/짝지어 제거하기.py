# 짝지어 제거하기
# 시간안에 풀지 못함
def solution(s):
    answer = -1
    fir_len = len(s)
    be_len = len(s)
    af_len = 0
    while len(s)>0:
        for i in range(1,len(s)):
            print(s,'1')
            if s[i-1] == s[i]:
                if i-1 != 0:
                    s=s[0:i-1] + s[i+1:]
                else:
                    s = s[i+1:]
                print(s)
                af_len = len(s)
                break
        if fir_len == len(s):
            print('한개도 안지워짐')
            answer =0
            break
        if af_len==be_len:
            print('중간에 못지워짐')
            answer = 0
            break
        be_len = af_len
    if len(s) == 0 :
        answer =1 

    return answer

s = 'cdcd'
print(solution(s))
# 1이 되는 조건
# 제거후 문자열 길이가 0이 될때

# 0이 되는 조건
# 1. 처음부터 중복 문자열이 없거나
# 2. 제거하는 도중 중복문자열이 없거나

## 다른사람 풀이
## Stack을 이용해 제거
## stack의 길이가 0일 경우 1 
def solution(s): 
    stack = []
    for i in s:
        if len(stack) == 0: stack.append(i)
        elif stack[-1] == i: stack.pop()
        else: stack.append(i)
    if len(stack) == 0: return 1
    else: return 0