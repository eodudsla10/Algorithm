# 문제
# >> 입력
# 5

# >> 출력
#     *
#    ***
#   *****
#  *******
# *********
# for j in range(5):
#     for i in range(1,10,2):
#         print("*",end='')

n = int(input())
for i in range(1,n+1):
	print(" "*(n-i)+("*"*(2*i-1)))

#다른 풀이 방법
#ljust -> 왼쪽을 다른 문자열로 앞 부분을 채워준다.
# a = "123123".rjust(10," ")
# print(len(a))
# print(a)
