def solution(nums):
    answer = 0
    mon_count = len(nums) # 전체 포켓몬의 수
    kind = set(nums)# 포켓몬 종류
    pick = mon_count/2 # 뽑을 포켓몬 수
    
    if len(kind) >= pick:
        answer = pick
    else:
        answer = len(kind)
    
    return answer