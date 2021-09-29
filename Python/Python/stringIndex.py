str = "Hello World"
print(str[:])


print(len(str))
print(str.count('l'))

print(str.find('W'))
# 없을 시 -1 return
print(str.find('w'))


print(str.upper())

print(str.lower())

str2 = "     hello        World         "
print(str2)
print(str2.lstrip())
print(str2.rstrip())