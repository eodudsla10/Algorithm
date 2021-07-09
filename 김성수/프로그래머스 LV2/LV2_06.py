# 더 맵게
#섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

def solution(scoville, K):
    answer = 0
    mix = scoville[0]
    i = 1
    while mix < K:
        answer +=1
        if mix < scoville[i]:
            mix += (scoville[i]*2)
        else:
            mix = scoville[i]+()
        print(mix)
        if mix > K:
            break
        if i >= len(scoville)-1:
            answer = -1
            break
        i +=1
    return answer


scoville = [1, 2, 3, 9, 10, 12]
k = 7
print(solution(scoville,k))
# 1 2 0 1
# 3   2
# 9   3