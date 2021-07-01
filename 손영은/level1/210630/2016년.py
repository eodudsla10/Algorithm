def solution(a, b):
    day = ''
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    weekday = ["FRI","SAT","SUN","MON","TUE","WED","THU"]
    if a > 1 :
    day = sum(month[:a-1]) + b-1 
    else:
    day = b - 1 
    answer = weekday[day % 7]
    return answer