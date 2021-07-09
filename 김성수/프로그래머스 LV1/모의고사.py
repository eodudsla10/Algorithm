def solution(answers):
    answer = []
    g_1 = [1,2,3,4,5]*2000
    ag1 = 0
    g_2 = [2,1,2,3,2,4,2,5]*1250
    ag2=0
    g_3 = [3,3,1,1,2,2,4,4,5,5]*1000
    ag3 = 0
    for g1 ,g2,g3,a in zip(g_1,g_2,g_3,answers):
        if g1 == a :
            ag1 +=1
        if g2 == a:
            ag2 +=1
        if g3 == a:
            ag3 +=1

    dic_c = {1:ag1,2:ag2,3:ag3}
    max_c = max(dic_c.values())
    for key, value in dic_c.items():
        if value == max_c:
            answer.append(key)
    return answer

answers = [1,3,2,4,2]	
print(solution(answers))