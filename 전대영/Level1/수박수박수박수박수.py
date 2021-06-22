#이 풀이를 좀 더 메모리를 효율적으로 만들려면
# s = "수박" *(n//2+1)
def water_melon(n):
    s = "수박" *(n//2+1)
    return s[:n]

print(water_melon(4))

