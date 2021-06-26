## stack을 이용해 뽑은 인형을 쌓고 
## 쌓기전 stack의 맨 위의 값과 비교후 같으면 삭제 다르면 삽입
## 해당 board의 값은 0으로 변환 후 break를 통해 빠져나온다

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
# [4,5,6]

board = [
#    1 2 3 4 5   => move
    [0,0,0,0,0], #1
    [0,0,1,0,3], #2
    [0,2,5,0,1], #3
    [4,2,4,4,2], #4
    [3,5,1,3,1]  #5
    ]
moves = [1,5,3,5,1,2,1,4]

print(solution(board,moves))