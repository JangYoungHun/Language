a = dict()

#다음중 오류가 나는것은?
a['name'] = 'python'
#a[('a',)] = 'python'
#a[[1]] = 'python'
#a[250] = 'python'

#a[[1]] 값은 변할수 있기때문에 사용 불가
print(a)