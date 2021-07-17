## 기능 개발 
def solution(progresses, speeds):
    answer = []
    queue = []
    for i in range(len(progresses)) :
        a = 100 -progresses[i]
        if a % speeds[i] == 0:
            queue.append(a//speeds[i])
        else:
            queue.append(a//speeds[i]+1)
    a = queue.pop(0)
    result = 1
    for i in range(len(queue)):
        if a >= queue[0]:
            result +=1
            queue.pop(0)
            if not(queue):
                answer.append(result)
        elif a < queue[0]:
            answer.append(result)
            result = 1
            a = queue.pop(0)
            if not(queue):
                answer.append(result)

    return answer

## 다른 사람의 문제 풀이
def solution2(progresses, speeds):
    Q=[]
    for p, s in zip(progresses, speeds):
        if len(Q)==0 or Q[-1][0]<-((p-100)//s):
            Q.append([-((p-100)//s),1])
        else:
            Q[-1][1]+=1
    return [q[1] for q in Q]


progresses =[93, 30, 55]
speeds = [1, 30, 5]

print(solution2(progresses,speeds))
