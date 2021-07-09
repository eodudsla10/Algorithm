def solution(nums):
    answer = 0
    how = len(nums)//2
    set_num = set(nums)
    if how >= len(set_num):
        return len(set_num)
    else:
        return how

nums =[3,3,3,2,2,2]
print(solution(nums))