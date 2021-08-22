def solution(arr):

    answer = []
    pre = -1 #0~9사이의 값이 아닌걸로 초기화한다
    for item in arr:

        if pre != item:

            answer.append(item)

            pre = item
    return answer