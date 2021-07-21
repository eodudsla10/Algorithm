from collections import deque
import heapq
def solution(priorities, location):
    answer = 0
    pri = deque()
    pri_max =[]
    # queue에 (우선순위,인덱스) 삽입
    for i in range(len(priorities)):
        pri.append((priorities[i],i))
        heapq.heappush(pri_max,(-priorities[i],i))
    print(pri_max)
    print(pri)

    p = pri.popleft()
    p_max = -heapq.heappop(pri_max)[0]
    # while문을반복하면서 원하는 인덱스 값이 나올 때까지 반복한다
    while True:
        
        if p[0] < p_max:
            pri.append(p)
            p = pri.popleft()
        else:
            if p[1] == location:
                answer+=1
                break
            p = pri.popleft()
            p_max =  -heapq.heappop(pri_max)[0]
            answer+=1
        
    return answer



priorities =[1, 1, 9, 1, 1, 1]
location =0

print(solution(priorities,location))