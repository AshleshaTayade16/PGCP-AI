nums=[1,2,3,4,5,6,7,8,9]
squares=[]

for num in nums:
    squares.append(num*num)
print(squares)
squares=[num*num for num in nums]
print(squares)
sq_even=[num*num for num in nums if num%2==0]
print(sq_even)
even_odd=['Even' if num%2==0 else 'Odd' for num in nums]
print(even_odd)

prices=[100,738,85968,875854,22,444,556]
def calc_discount(p):
    return p*0.8

discounted=[calc_discount(p) for p in prices]
print(discounted)

books=[[123,'Python',333],
       [111,'Java',444],
       [333,'React',555]]

discounted=[calc_discount(item[2]) for item in books]
print(discounted)

my_str='Was it a rat I saw?'
cleaned=[ch.lower() for ch in my_str if ch.isalpha()]
print(''.join(cleaned))
if(cleaned==cleaned[::-1]):
    print('Pass')
