sum = 0
i = 0

while i <= 10:


    if i%2 == 1:
        print("i : %d" %i)
        i = i+1
        continue
        
    else:
        sum += i
        i = i+1


print(sum)