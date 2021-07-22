def solution(s):
    s_list = s.split(" ")
    answer = ''

    for k in range(len(s_list)):
        s_list2 = list(s_list[k])

        for i in range(len(s_list2)):
            if i%2 ==0:
                s_list2[i] = s_list2[i].upper()
            elif i %2 ==1:
                s_list2[i] = s_list2[i].lower()
        s_list[k] = "".join(s_list2)

    answer = " ".join(s_list)
    
    return answer

s = "try hello world"
print(solution(s))