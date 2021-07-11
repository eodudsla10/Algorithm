def solution(strings, n):
    tmp = []
    for i in strings :
        i = i[n]+i
        tmp.append(i)
    tmp.sort()
    
    answer = []
    for i in tmp :
        i = i[1:]
        answer.append(i)
    return answer

n=1
strings = ["sun", "bed", "car"]
print(solution(strings,n))