def solution(s):
    #각각의 압축한 문자열의 길이를 담을 리스트
    length = []
    #압축된 문자열을 저장할 변수
    result = ""
    # 문자열 길이가 1이라면 1출력
    if len(s) == 1:
        return 1
    # 문자열을 2로 나누어 문자열 길이보다 길어지는 비교는 하지 않아도 되니 2로 나눈다 
    # ex) abcdefgh/abcdefg
    # 모든 단위의 문자열을 비교 (완전 탐색)
    # a비교(a다음 문자)
    for cut in range(1, len(s) // 2 + 1): 
        count = 1
        tempStr = s[:cut] 
        # 문자열을 cut 단위별로 자른다
        for i in range(cut, len(s), cut):
            # 바깥 for에서 자른 문자열과 비교
            ㅊ=s[i:i+cut]
            #같다면
            if s[i:i+cut] == tempStr:
                count += 1
            #같지 않다면
            else:
                if count == 1:
                    count = ""
                result += str(count) + tempStr
                #다음 단위를 비교할 tempstr에 저장
                tempStr = s[i:i+cut]
                count = 1

        if count == 1:
            count = ""
        result += str(count) + tempStr
        length.append(len(result))
        result = ""
    # print(length)
    # 가장 작은 길이를 출력
    return min(length)


s = "abcabcabcabcdededededede"
print(solution(s))