def solution(n, arr1, arr2):
    answer = []
    for a1, a2 in zip(arr1,arr2):
        # 10진수를 n에 해당하는 2진수로 변환
        a1_2 = bin(a1)[2:].rjust(n,'0')
        a2_2 = bin(a2)[2:].rjust(n,'0')
        해독 =''
        for a12 , a22 in zip(a1_2,a2_2):
            if a12 =='1' or a22 =='1':
                해독+='#'
            else:
                해독+=' '
        answer.append(해독)
    return answer



n = 5
arr1 =	[9, 20, 28, 18, 11]
arr2 = [30, 1, 21, 17, 28]


print(solution(n,arr1,arr2))


#################################
#다른 사람 풀이 

def solution(n, arr1, arr2):
    answer = []
    for i,j in zip(arr1,arr2):
        a12 = str(bin(i|j)[2:])
        a12=a12.rjust(n,'0')
        a12=a12.replace('1','#')
        a12=a12.replace('0',' ')
        answer.append(a12)
    return answer

