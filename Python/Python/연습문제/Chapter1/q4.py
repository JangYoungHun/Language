#pin = "881120-1068234"
pin = "881120-2068234"
gender = int(pin[-7])
#성별은 주민번호 뒷자리 첫번째 숫자다
print("성별 숫자 : {0}".format(gender))

if gender==1:
    print("남성")
elif gender==2:
    print("여성")
