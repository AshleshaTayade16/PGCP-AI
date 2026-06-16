my_str='Python is dynamic language'
print(my_str)

print('Python' in my_str)
print('Java' not in my_str)

for ch in my_str:
    print(ch)

print('Indexing and Slicing')
print(my_str[3])
print(my_str[-3])

print('Slicing')
print(my_str[4:10])
print(my_str[14:10])
print(my_str[-14:-10])
print(my_str[4:20:3])
print('hhhh')
print(my_str[4:20:-3])
print(my_str[20:4:-3])
print(my_str[::-1])
print(my_str[:4]+my_str[4:]) #concatination

print('-----char classification---')
value = 'abc'
print(value.isalpha())
value = '123'
print(value.isdecimal())
value ='123\u00B2'
print(value.isdigit())
value ='123\u00B2\u2168'
print(value.isnumeric())

value ='abc123\u00B2\u2168'
print(value.isalnum())
print(my_str.isalnum())

print('-----case conversion-----')
print(my_str.upper())
print(my_str.lower())
print(my_str.capitalize())
print(my_str.title())
print(my_str.swapcase())

print('----other methods-----')
print(my_str.startswith('python'))
print(my_str.endswith('python'))
print(my_str.count('a'))
print(my_str.find('a'))
print(my_str.rfind('a'))
print(my_str.index('l'))
print(my_str.replace('a','e',2))

words = my_str.split(' ',2)
print(words)
sentences= ','.join(words)
print(sentences)
parts = my_str.partition('language')
print(parts)