## 문자열 내 p와 y의 개수

def solution(s):
    s = s.lower()
    if s.count('p') == s.count('y'):
        return True
    else:
        return False

s ="Pyy"
print(solution(s))
