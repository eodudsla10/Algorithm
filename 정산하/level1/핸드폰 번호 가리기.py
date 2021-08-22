def solution(phone_number):
    answer = ''
    number_count = len(phone_number)

    answer = "*"*(number_count-4) + phone_number[len(phone_number)-4:len(phone_number)]
    
    # for i in range(number_count-4,number_count):
    #     answer += phone_number[i]
    return answer