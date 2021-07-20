
## 트리형태의 알고리즘 문제 

def solution(enroll, referral, seller, amount):
    answer = []
    dic = {}
    cost = {}
    for key, value in zip(enroll, referral):
        if key not in dic:
            dic[key] = value
        else:
            dic[key]=value
        cost[key] = 0
    # print(dic)
    # print(cost)

    for s, a in zip(seller, amount):
        now_money = a*100
        now_name = s
        while True:
            # 조건이 안될 때 최상위가 '-'일 경우 스탑
            if now_name =='-':
                break
            if now_money//10 <1:
                cost[now_name] +=now_money
                break
            cost[now_name]+=now_money-(now_money//10)      
            now_money = now_money//10
            now_name = dic[now_name]
    # print(cost)

    for name in enroll:
        answer.append(cost[name])
    return answer

enroll = ["john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"]
referral = ["-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"]
seller = ["young", "john", "tod", "emily", "mary"]
amount = [12, 4, 2, 5, 10]

print(solution(enroll, referral, seller, amount))