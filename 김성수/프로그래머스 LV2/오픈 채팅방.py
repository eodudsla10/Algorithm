# 오픈 채팅방

def solution(record):
    answer = []
    dic = {}
    id = []
    for r in record:
        a = r.split(' ')
        if a[0] == 'Enter':
            dic[a[1]] = a[2]
            id.append([a[1],'님이 들어왔습니다.'])
        elif a[0] == 'Leave':
            id.append([a[1],'님이 나갔습니다.'])
        else:
            dic[a[1]] = a[2]

    for i in id:
        answer.append(dic[i[0]]+i[1])

    return answer



record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]

result=solution(record)
print(result)