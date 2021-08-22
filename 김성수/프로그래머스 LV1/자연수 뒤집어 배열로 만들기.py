def solution(n):
    list_n = list(map(int,str(n)))
    return list_n[::-1]


# def solution2(n):
#     answer = []
#     n_list = list(map(int,str(n)))
#     for i in n_list[::-1]:
#         answer.append(int(i))
#     return answer

print(solution(12345))


##
# list1 = [1,2,3,5,4]
# print('list1 :',list1)
# list1.reverse()
# print('list1 reverse:',list1)

# list3 = list(reversed(list1))
# print('list1:',list1)
# print('list3 reversed:',list3)

