def solution(phone_number):
    c = 1
    result =''
    for  i in phone_number[-1::-1]:
        if c>4 :
            result +='*'
        else:
            result+=i
        c +=1
 
    return result[::-1]

print(solution("027778888"))