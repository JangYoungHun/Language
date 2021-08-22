fruit = ["사과", "사과", "복숭아", "복숭아", "배", "포도", "포도", "사과"]

dic = {} # 사과 , 복숭아 , 파인애플 , 배, 포도


for x in fruit :
    if x in dic:
        dic[x] = dic[x]+1
    else:
        dic[x] = 1

print(dic)
