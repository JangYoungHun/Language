def cal(x, y):
    print("%d + %d : %d " %(x, y, x+y))
    print("%d - %d : %d " %(x, y, x-y))
    print("%d * %d : %d " %(x, y, x*y))
    print("%d / %d : %d " %(x, y, x/y))
    return "계산 끝"

x = 3
y = 2
z = cal(x,y)
print(z)