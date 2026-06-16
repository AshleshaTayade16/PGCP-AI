#Q2. Check if all the letters in a string are uppercase

my_str=input('Enter the 1 line text: ')
count=0
my_str = my_str.replace(" ", "")

for i in my_str:
    if 'A'<=i<='Z':
        continue
    else:
        print('Not all letters in the string are uppercase')
        count+=1
        break
if count==0:
    print('all letters in the string are uppercase')