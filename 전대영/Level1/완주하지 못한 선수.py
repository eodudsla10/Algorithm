# 잘못된 대영이의 풀이1(1시간 이상 소요)
# def solution(participant, completion):
#     answer = ''
#     for x in participant:
#         for j in completion:
#             if x == j:
#                 participant.remove(x)
#                 break
#     return answer

# 성수도움 풀이1 zip함수, for else문 사용
# def solution(participant, completion):
#     answer = ''
#     participant.sort()
#     completion.sort()
#     for x,y in zip(participant,completion):
#         if x != y:
#             answer = x
#             break
#     else:
#         answer = participant[-1]
#     return answer

# participant = ["leo", "kiki", "eden"]
# completion = ["eden", "kiki"]
# print(solution(participant,completion))

#완상이형 도움 - 인덱스 탐색으로 표현
# def solution(participant, completion):
#     answer = ''
#     participant.sort()
#     completion.sort()
#     for i in range(len(completion)):
#         if participant[i] != completion[i]:
#             answer = participant[i]
#     if answer == '':
#         answer = participant[-1]
    
#     return answer

#해시 방법
def solution(participant, completion):
    answer = ''
    temp = 0
    dic = {}
    for part in participant:
        dic[hash(part)] = part
        temp += int(hash(part))
    for com in completion:
        temp -= hash(com)
    answer = dic[temp]

    return answer

participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]
print(solution(participant,completion))


