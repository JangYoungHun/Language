
scores = {'국어': 80, '영어':75 , '수학':55 }

sum = 0

for i in scores.values():
    sum += i 

print(f"총 합 : {sum}")
avg = sum/len(scores)
print(f"평균 : {avg}")