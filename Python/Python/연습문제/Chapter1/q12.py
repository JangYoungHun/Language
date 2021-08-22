a= b= [1,2,3]

a[1] = 4

print("a= b= [1,2,3]  변수 선언 ")
print("a[1] = 4 변경 ")
print(f"a의 주소 : {id(a)}")
print(f"b의 주소 : {id(a)}")
print(f"a와 b의 주소 동일 여부  : {a is b}")
print(f"a 리스트 : {a}")
print(f"b 리스트 : {b}")