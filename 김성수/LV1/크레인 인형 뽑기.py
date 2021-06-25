## stack을 이용해 뽑은 인형을 쌓고 
## 쌓기전 stack의 맨 위의 값과 비교후 같으면 삭제

def solution(board,moves):
    stack = []
    result =0
    for m in moves:
        for b in board:
            if b[m-1] :
                if not stack:
                    stack.append(b[m-1])
                else:
                    if stack[-1] == b[m-1]:
                        stack.pop()
                        result +=2
                    else:
                        stack.append(b[m-1])
                b[m-1] =0
                break
    
    return result


board = [
    [0,0,0,0,0],
    [0,0,1,0,3],
    [0,2,5,0,1],
    [4,2,4,4,2],
    [3,5,1,3,1]
    ]
moves = [1,5,3,5,1,2,1,4]

print(solution(board,moves))