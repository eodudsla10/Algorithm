def solution(x):
    s = str(x)
    a=0
    for i in s :
        a +=int(i)
    if x%a==0:
        return True
    return False