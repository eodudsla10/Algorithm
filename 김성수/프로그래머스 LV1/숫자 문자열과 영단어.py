def solution(s):
    numbers = ['zero','one','two','three','four','five','six','seven','eight','nine']
    num = ''
    result = ''
    for i in s :
        if i.isalpha():
            num+=i
        else:
            result+=i
        if num in numbers:
            result+=str(numbers.index(num))
            num=''
    return int(result)


s = "one4seveneight" 

print(solution(s))

