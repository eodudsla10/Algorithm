def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    completion.append('-')
    
    for i, value in enumerate(participant):
        if not value == completion[i]:        
            return value