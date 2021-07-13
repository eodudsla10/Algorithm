def string_to_time(String):
    h,m,s = String.split(':')
    h_to_s = int(h)*3600
    m_to_s = int(m)*60
    return h_to_s+m_to_s+int(s)

def solution(play_time, adv_time, logs):
    answer = ''
    TIME_MAX = 360000
    last_play_time = string_to_time(play_time)
    all_adv_time = string_to_time(adv_time)
    logs_time = []
    dp = [0]*TIME_MAX
    for log in logs:
        start , end = log.split('-')
        start_time = string_to_time(start)
        end_time = string_to_time(end)
        logs_time.append([start_time,end_time])
    # print(logs_time)

    for lt in logs_time:
        for i in range(lt[0],lt[1]-1):
            dp[i] +=1
    print(dp)

    if all_adv_time >= last_play_time:
        return '00:00:00'

    return answer


play_time ="02:03:55"	

adv_time = "00:14:15"	

logs = ["01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"]

print(solution(play_time,adv_time,logs))