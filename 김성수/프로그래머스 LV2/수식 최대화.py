from itertools import permutations

def solution(expression):
    answer = []
    연산자 = []
    숫자=''
    e_list= []
    for i in expression:
        if not i.isdigit():
            연산자.append(i)
            e_list.append(int(숫자))
            e_list.append(i)
            숫자=''
        else:
            숫자+=i
    else:
        e_list.append(int(숫자))
    print(set(연산자))
    print(e_list)
    경우의수 = list(permutations(set(연산자),3))
    print(경우의수)
    # print(e_list.index('-'))

    for i in 경우의수:
        a = 0
        for j in i:
            if j == '-':
                index = e_list.index('-')
                a+=(e_list[index-1]-e_list[index+1])

    return max(answer)


expression = "100-200*300-500+20"

print(solution(expression))