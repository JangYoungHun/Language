#Dictionary {key : value}

dic = { "홍길동" : 3, "가나다" : 2}
print(dic["홍길동"])

print(dic.get("가나다"))

# print(dic.get("없는 키"))   # none 리턴
# print(dic["없는 키"])   # 에러 발생

print(3 in dic)   # key in Dictionary
print("홍길동" in dic)  


#추가
dic["마바사"] = 1
print(dic)

dic["홍길동"] = 5
print(dic)

#제거
del dic["홍길동"]
print(dic)

#key 만 출력 
print(dic.keys())

#value 만 출력 
print(dic.values())

#비우기
dic.clear()
print(dic)