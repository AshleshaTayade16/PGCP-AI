import math1
print('1.Addition\n'
      '2.Subtraction\n'
      '3.Multiplication\n'
      '4.Division')
num1=int(input("Enter the first number: "))
num2=int(input("Enter the second number: "))
choice=int(input("Enter choice: "))

match choice:
    case 1:
        result =math1.addition(num1,num2)
        print('result',result)
    case  2:
        result =math1.subtraction(num1,num2)
        print('result',result)
    case 3:
        result =math1.multiplication(num1,num2)
        print('result',result)
    case 4:
        result =math1.division(num1,num2)
        print('result',result)
    case _:
        print('Inv1alid choice.........')