# Q5. Find LCM and GCD for given numbers[take 2 numbers] using only loops
num1=int(input('Enter 1st number: '))
num2=int(input('Enter 2nd number: '))
gcd=1
maxNum=max(num1,num2)
minNum=min(num1,num2)
lcm=maxNum

for i in range(1,minNum+1):
    if minNum%i==0 and maxNum%i==0:
        gcd=i
print('HCF is ',gcd)

while True:
    if lcm%maxNum==0 and lcm%minNum==0:
        break
    lcm+=1
print('LCM is ',lcm)