str = "a:b:c:d"

# replace 사용하여 a#b#c#d 로 변경하여라
print(f"변경전 문자열 : {str}")

newStr = str.replace(':','#')
print(f"변경 후 문자열 : {newStr}")