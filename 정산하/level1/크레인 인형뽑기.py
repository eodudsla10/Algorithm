def solution(board, moves):
    answer = 0
    count = 0
    result = []
    for m in moves: # 크레인 이동
        for i in range(0,len(board)): # 행
            if board[i][m-1] != 0:
                if len(result) == 0:
                    result.append(board[i][m-1])
                    board[i][m-1] = 0
                    break
                elif len(result) != 0:
                    if result[len(result)-1] == board[i][m-1]:
                        result.pop(len(result)-1)
                        board[i][m-1] = 0
                        count += 1
                        break
                    else:
                        result.append(board[i][m-1])
                        board[i][m-1] = 0
                        break
    answer = count * 2
    return answer