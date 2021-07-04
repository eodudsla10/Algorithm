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

## 
def solution2(phone_number):
    # 문자열을 list로 형변환
    list_number =list(phone_number)
    # 마지막 4개의 숫자를 제외한 나머지 문자열 변환 
    for i in range(0,len(phone_number)-4,1):
        list_number[i] = '*'
    
    ## .join 함수를 이용해 리스트를 문자열로 형변환
    result = "".join(list_number)
    return result


print(solution2("0144444444444"))