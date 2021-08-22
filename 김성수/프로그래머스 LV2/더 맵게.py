# 더 맵게
#섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

import heapq

def solution(scoville, K):
    answer = 0
    # heap에 스코빌 리스트를 삽입
    min_heap=[]
    for s in scoville:
        heapq.heappush(min_heap,s)
    # min heap에서 값을 하나씩 빼면서 k와 비교후 작으면 섞는다
    while True:
        if len(min_heap) == 1 and min_heap[0] <K:
            answer = -1
            break
        min_s1 = heapq.heappop(min_heap)
        if min_s1 < K:
            answer+=1
            min_s2 = heapq.heappop(min_heap)
            mix_s = min_s1 +(min_s2*2)
            heapq.heappush(min_heap,mix_s)
        else:
            break
    return answer


scoville = [1, 1,1]
k = 8
print(solution(scoville,k))
# 1 2 0 1
# 3   2
# 9   3