age = int(input('entered your age'))
if age >18:
    print('permitted')
else:
    print('not permitted')

gender = input('enter your gender M/F')
if age >18:
    if gender == 'M':
        print('man')
    else:
        print('women')
else:
    print('child')

if age>18 and gender =='M':
    print('man')
elif age >18 and gender == 'F':
    print('women')
else:
    print('child')

marks = int(input('entered marks'))
if 85<marks<100:
    print('A')
if 60< marks<85:
    print('B')
if 45<marks<60:
    print('C')
else:
    print('D')
