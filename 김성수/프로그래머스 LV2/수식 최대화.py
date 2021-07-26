from itertools import permutations
def solution(expression):
    answer = []
    연산자 = []
    숫자=''
    e_list= []
    e_copy = []
    for i in expression:
        if not i.isdigit():
            연산자.append(i)
            e_copy.append(int(숫자))
            e_copy.append(i)
            숫자=''
        else:
            숫자+=i
    else:
        e_copy.append(int(숫자))
    # print(set(연산자))
    # print(e_copy)
    경우의수 = list(permutations(set(연산자),len(set(연산자))))
    
    # print(경우의수)
    # print(e_list.index('-'))

    for i in 경우의수:
        a = 0
        e_list=e_copy.copy()
        for j in i:
            if j == '-':
                while True:
                    if '-'  not in e_list:
                        break
                    index = e_list.index('-')
                    a=(e_list[index-1]-e_list[index+1])
                    e_list[index] = a
                    e_list.pop(index-1)
                    e_list.pop(index)
            elif j == '+':
                while True:
                    if '+' not in e_list:
                        break
                    index = e_list.index('+')
                    a=(e_list[index-1]+e_list[index+1])
                    e_list[index] = a
                    e_list.pop(index-1)
                    e_list.pop(index)
            elif j=='*':
                while True:
                    if '*' not in e_list:
                        break
                    index = e_list.index('*')
                    a=(e_list[index-1]*e_list[index+1])
                    e_list[index] = a
                    e_list.pop(index-1)
                    e_list.pop(index)
        if e_list[0] <0:
            e_list[0]*=-1
        answer.append(e_list[0])
    # print(answer)
    return max(answer)


expression = "50*6-3*2"

print(solution(expression))