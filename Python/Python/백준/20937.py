#https://www.acmicpc.net/problem/20937
# 미해결
# Python 3 (4%) 시간초과
# Pypy 3 (54%) 시간초과
number = int(input())
data = list(map(int, input().split()))
count={}

for dataList in data:
    try: count[dataList] += 1
    except: count[dataList]=1

val = list(count.values())

cnt = 0 

while True :
    num = min(data)
    if num == 0 :
         break
    cnt += num
    for i in range(0 , len(val)):
        val[i] -= num    
    
    while True:                
        try: val.remove(0)
        except: break
    
    if(len(val) == 0):
        break

print(cnt)


      