# 문자열과 내장 함수


#upper -> 소문자를 대문자로 변환
#lower -> 대문자를 소문자로 변환
#find -> 해당되는 문자를 찾아 인덱스 번호를 전달
#count -> 해당되는 문자를 찾아 총 갯수를 전달
#isupper -> 대문자만 찾아서 출력
#islower -> 소문자만 찾아서 출력
#isalpha -> 알파벳만 출력 -> 알파벳이 아닌 함수는 처리 안해서 공백문자를 처리
msg="It is Time"
print(msg.upper())
print(msg)

print(msg.find('t'))
print(msg.count('t'))

for x in msg:
    if x.isupper():
        print(x, end='')

print()

for x in msg:
    if x.islower():
        print(x, end='')

print()
for x in msg:
    if x.isalpha():
        print(x, end='')