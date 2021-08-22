a = ['Life', 'is', 'too', 'short']

#  Life is too short  문자열로 만들어라

# 방법 1 

str = ""
for i in a:
    str += i

print(str)    

# 방법 2
print(' '.join(a))
