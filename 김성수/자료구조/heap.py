import heapq
#오름차순 힙 정렬(heap sort)
def heapsort(iterable):
    h=[]
    result = []
    # 모든 원소를 차례대로 힙에 삽입
    for value in iterable:
        heapq.heappush(h,value)
    # 힙에 삽입된 모든 원소를 차례대로 꺼내어 담기
    for i in range(len(h)):
        result.append(heapq.heappop(h))
    return result 

result = heapsort([1,3,5,7,9,2,4,6,8,0])
print(result)
 

## 최대 힙

# 내림차순 힙 정렬(Heap Sort)
def max_heapsort(iterable):
    h = []
    result = []
     # 모든 원소를 차례대로 힙에 삽입
    for value in iterable:
        # 부호를 바꿔서 입력
        heapq.heappush(h,-value)
    # 힙에 삽입된 모든 원소를 차례대로 꺼내어 담기
    for i in range(len(h)):
        #다시 부호를 바꿔서 꺼낸다
        result.append(-heapq.heappop(h))
    return result 

result = max_heapsort([1,3,5,7,9,2,4,6,8,0])
print(result)