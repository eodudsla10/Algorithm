def solution(rows, columns, swipes):
    answer = []
    
    # 메트릭스 생성
    matrix = [[0] * columns for i in range(rows)]
    idx = 1
    for x in range(rows):
        for y in range(columns):
            matrix[x][y] = idx
            idx += 1
    print(matrix)
 
    for swipe in swipes:
        d = swipe[0]
        r1, c1, r2, c2 = map(lambda x: x-1, swipe[1:])
        overflow = []

        if d == 1:
            for c in range(c1, c2+1, 1):
                temp = 0
                for r in range(r1, r2+1, 1):
                    temp, matrix[r][c] = matrix[r][c], temp
                else:
                    matrix[r1][c] = temp
                    overflow.append(temp)
        
        elif d == 2:
            for c in range(c2, c1-1, -1):
                temp = 0
                for r in range(r2, r1-1, -1):
                    temp, matrix[r][c] = matrix[r][c], temp
                else:
                    matrix[r2][c] = temp
                    overflow.append(temp)

        elif d == 3:
            for r in range(r1, r2+1, 1):
                temp = 0
                for c in range(c1, c2+1, 1):
                    temp, matrix[r][c] = matrix[r][c], temp
                else:
                    matrix[r][c1] = temp
                    overflow.append(temp)

        elif d == 4:
            for r in range(r2, r1-1, -1):
                temp = 0
                for c in range(c2, c1-1, -1):
                    temp, matrix[r][c] = matrix[r][c], temp
                else:
                    matrix[r][c2] = temp
                    overflow.append(temp)

        print(matrix)
        answer.append(sum(overflow)) 


    return answer

rows = 4
columns = 3
swipes = [
    [1, 1, 2, 4, 3],
    [3, 2, 1, 2, 3],
    [4, 1, 1, 4, 3],
    [2, 2, 1, 3, 3]
]
print(solution(rows, columns, swipes))