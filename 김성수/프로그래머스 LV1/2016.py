def solution(a, b):
    days= 0
    month = [0,31,29,31,30,31,30,31,31,30,31,30,31]
    day = ['THU','FRI','SAT','SUN','MON','TUE','WED']
    for i in range(a):
        days +=month[i]
    days +=b
    return day[days%7]


# 1월 1일 금요일
# 1월 8일 금요일
a , b = 5 ,24

print(solution(a,b))
