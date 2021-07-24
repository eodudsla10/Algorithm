def solution(arr):
    min_V = min(arr)
    arr.remove(min_V)
    if len(arr) == 0:
        return  [-1]
    return arr