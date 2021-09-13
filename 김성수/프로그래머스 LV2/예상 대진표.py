def solution(n,a,b):

    count = 1
    while True:
        if a%2 !=0:
            if  a ==1:
                a = 1
            a =(a//2)+1
        else:
            a //= 2
        if b%2 !=0:
            if b ==1:
                b=1
            b = (b//2) +1
        else:
            b //= 2

        if a == b:
            return count 
        count +=1

print(solution(8,4,7))