def solution(array, commands):
    answer = []
    for e in commands:
        temp = []
        for i in range(e[0]-1, e[1]):
            temp.append(array[i])
        answer.append(sorted(temp)[e[2]-1])

    return answer