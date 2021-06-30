def solution(participant, completion):
    answer = ''
    
    # 1(50점)
    # participant.sort()
    # completion.sort()
    # for cPerson in completion: # 한명씩 완주한사람을 참가자 리스트에서 지움
    #     participant.remove(cPerson) # 동명이인은 앞에있는 사람이름을 지움
    # answer = participant.pop()
    
    # 2(70점)
    set_p = set(participant)
    if len(set_p) == len(completion):
        answer = max(participant, key=participant.count)
    else:
        set_c = set(completion)
        check = list(set_p - set_c)
        answer = check[0]
    
    # 2-1
    # set_p = set(participant)
    # if len(set_p) - len(completion) == 1:
    #     set_c = set(completion)
    #     check = list(set_p - set_c)
    #     answer = check[0]
    # else:
    #     answer = max(participant, key=participant.count)
       
    # 3(30점)
    # p_m = max(participant, key=participant.count)
    # c_m = max(completion, key=completion.count)
    # if participant.count(p_m)  > completion.count(p_m):
    #     if participant.count(p_m) != completion.count(p_m):
    #         answer = p_m
    # else:
    #     set_p = set(participant)
    #     set_c = set(completion)
    #     check = list(set_p - set_c)
    #     answer = check[0]

    
    return answer