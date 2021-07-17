import heapq

def solution(N, stages):
    stage_f = [0]*(N+1)
    #각 스테이지별 도전자수 리스트
    for stage in stages:
        if stage == N+1:
            continue
        stage_f[stage] +=1
    # print(stage_f)
    # 각 스테이지별 실패율 계산후 max_heap에 추가 
    fail_list=[]

    c_p = len(stages)
    for i in range(1,len(stage_f)):
        if c_p !=0:
            n_c = stage_f[i]
            heapq.heappush(fail_list,[ -(n_c/c_p),i])
            c_p -=n_c
        ## 아무도 스테이지 5에 도달하지 못했을 경우
        else:
            heapq.heappush(fail_list,[ 0,i])

    answer =[]
    for _ in range(len(fail_list)):
        answer.append(heapq.heappop(fail_list)[1])
    return answer

N = 5
stages = [2,1,2,4,2,4,3,3]

print(solution(N,stages))