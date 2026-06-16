# name=input('Enter your name:')
# age=int(input('Enter your age: '))
#
# print('You have entered', name,'and', age)
# print('You have entered {} and {} '.format(name,age))
# print(f'You have entered {name} and {age}')

no =4e6
print(no)
print(f'{no:.0f}')
print(f'{no:.2f}')
print(f'{no:,.0f}')

#alignment
num=25
print(num)
print(f'{num:<10}')
print(f'{num:>10}')
print(f'{num:^10}')
print(f'{num:10}')
print(f'{num:06}')

#percentage
marks = 0.75
print(f'{marks:0%}')
print(f'{marks:.0%}')
print(f'{marks:.2%}')