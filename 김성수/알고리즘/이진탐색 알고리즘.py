# 이진 탐색 소스코드 구현 ( 재귀 함수)
def binary_search(array,target,start,end):
    print(start,end)
    if start > end:
        return None
    mid = (start+end)//2
		## 찾은 경우 간점 인덱스 반환
    if array[mid] == target:
        return mid
		## 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
    if array[mid] > target :
        return binary_search(array,target,start,mid-1)
		## 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
    else:
        return binary_search(array,target,mid+1,end)


array = [1,3,4,5,7,8,12,31,41]
target = 5

print(binary_search(array,target,0,len(array)-1))