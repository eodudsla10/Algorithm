def solution(s):

    strings = [i for i in s]
    strings.sort(reverse=True)
    return ''.join(strings)


s = "Zbcdefg"

print(solution(s))