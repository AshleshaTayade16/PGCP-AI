# Q3. Write a python program to swap a 3 digit number
num=int(input('Enter number: '))
opt=0

while num!=0:
    digit=num%10
    opt=opt*10+digit
    num=num//10
print(opt)