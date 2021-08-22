from itertools import combinations

def primeNumber(num) : #만약에 소수일 경우, True를 반환하여 count를 1 늘린다.
    for i in range(2, num) :
        if num % i == 0 :
            return False
    return True


def solution(nums):
    case = []
    sum_case = []
    count = 0
    for i in list(combinations(nums,3)):
        case.append(sum(i))
    for i in case :
        if primeNumber(i) :
            count += 1
    return count