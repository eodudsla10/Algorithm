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

