from sys import stdin
import heapq

min_heap =[]
max_heap = []
N = int(stdin.readline())
for _ in range(N):
    num = int(stdin.readline())
    # 핵심 1. 넣는 방법
    if len(min_heap) == len(max_heap):
        heapq.heappush(max_heap,-num)
    else:
        heapq.heappush(min_heap,num)
    # print('max : ',max_heap)
    # print('min : ', min_heap)

    if not min_heap:
        print(-max_heap[0])
    elif min_heap[0]>=max_heap[0]:
        print(-max_heap[0])
    else:
        min,max = heapq.heappop(min_heap) , -(heapq.heappop(max_heap))
        heapq.heappush(min_heap,max)
        heapq.heappush(max_heap,-min)
        print(-max_heap[0])