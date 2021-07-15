def solution(N, stages):
    answer = []
    tmp = {}
    stages.sort()
    for i in range(1, N+1) :
        tmp[i] = stages.count(i) / len(stages)
        del stages[:stages.count(i)]
    print(tmp)
    answer = sorted(tmp, key=lambda x : dict[x], reverse = True)
    return answer

N = 5 
stages= [2, 1, 2, 6, 2, 4, 3, 3]
print(solution(N,stages))

