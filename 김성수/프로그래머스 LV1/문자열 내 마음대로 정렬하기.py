def solution(strings, n):
    answer = []
    string_n_list = []
    for index,s in enumerate(strings):  
        sn=s[n]
        string_n_list.append((sn,s))
    string_n_list.sort()
    for i in string_n_list:
        answer.append(i[1])
    return answer

strings = ["sun", "bed", "car"]
n = 1

print(solution(strings ,n))