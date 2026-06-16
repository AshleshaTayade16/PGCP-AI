#for
for i in range(10):
    print(i)

for i in range(1,11,2):
    print(i)


for i in range (10):
    if i == 6:
        break
    print(i)

#prime no
num = 15
for i in range (2,num):
    if num%i == 0:
        print('non prime')
        break
    else:
        print('prime')


#while
num=18
i = 2
while i<num:
    if num%i==0:
        print('not prime')
        break
    i+=1
else:
    print('prime')


