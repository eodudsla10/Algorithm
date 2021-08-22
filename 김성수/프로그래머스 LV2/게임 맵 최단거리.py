from collections import deque

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    answer = -1
    #0,0 좌표 방문처리
    queue = deque([[0,0,1]])
    maps[0][0] = 0
    # 상하 좌우 이동 좌표
    dxy = [[-1,0],[1,0],[0,-1],[0,1]]
    while queue:
        now_m = queue.popleft()
        # 상하 좌우 이동
        for i in dxy:
            x = now_m[0] + i[0]
            y = now_m[1] + i[1]
            count = now_m[2]
            ## 0 과 index를 초과하지 않고 1인 값으로 이동 후 방문처리
            if 0<= x <n and 0<= y <m and maps[x][y] ==1:
                count+=1
                maps[x][y] = 0
                if x == n-1 and y == m-1:
                    return count
                queue.append([x,y,count])              
    return answer


maps = [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]

print(solution(maps))