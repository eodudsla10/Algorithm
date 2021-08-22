from sys import stdin
import heapq

min_heap =[]
max_heap = []
N = int(stdin.readline())
for _ in range(N):
    num = int(stdin.readline())
    # 핵심 1. 넣는 방법
    # 번갈아 가며 넣는다 - 리스트의 길이를 비교해 같으면 min_heap에 다르면 max_heap에 
    if len(min_heap) == len(max_heap):
        heapq.heappush(max_heap,-num)
    else:
        heapq.heappush(min_heap,num)
    # print('max : ',max_heap)
    # print('min : ', min_heap)

    # 주요 알고리즘 
    # min_heap의 0번째 값과 max_heap의 0째 값을 비교후
    # max_heap의 0번째 값이 작은 경우 max_heap의 0번째 값 출력
    # 예외 min_heap에 데이터가 없으면 비교를 못하기 때문에 예외경우로 둔다
    if not min_heap:
        print(-max_heap[0])
    elif min_heap[0]>=max_heap[0]:
        print(-max_heap[0])
    else:
        ## 만약에 min_heap의 값이 더 큰경우 
        ## 두0번째 값을 교환해준다
        min,max = heapq.heappop(min_heap) , -(heapq.heappop(max_heap))
        heapq.heappush(min_heap,max)
        heapq.heappush(max_heap,-min)
        print(-max_heap[0])