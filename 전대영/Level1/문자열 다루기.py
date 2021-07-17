def solution(s):
    answer = True
    for i in range(len(s)):
        if s[i].isalpha():
            answer = False
    if len(s) == 4 & s.isdigit():
        answer = True
    elif len(s) ==6 & s.isdigit():
        answer = True
    return answer

s ="a1234"
print(solution(s))