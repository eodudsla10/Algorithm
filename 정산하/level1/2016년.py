def solution(a, b):
    answer = ''
    count_day = 0
    day = ['THU', 'FRI','SAT','SUN','MON','TUE','WED','THU']
    if a != 1:
        for i in range(1,a):
            if i == 1 or i == 3 or i == 5 or i == 7 or i == 8 or i == 10 or i ==12:
                count_day += 31
            elif i == 2:
                count_day += 29
            else:
                count_day += 30
    count_day += b
    print(count_day)
    
    answer = day[int(count_day%7)]
    
    return answer