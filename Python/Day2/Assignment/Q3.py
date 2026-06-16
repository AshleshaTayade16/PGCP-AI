#Q3. Write a version of a palindrome recognizer that also accepts phrase palindromes such as
# Was it rat I saw? or Dammit, I'm mad! Note that punctuation, capitalization and spacving
# are usually ignored

my_str=input('Enter the phrase: ')
my_str=my_str.replace(" ",'')
my_str=my_str.lower()
str=''

for i in my_str:
    if 'a'<=i<='z':
        str=str+i

if str==str[::-1]:
    print('its palindrome')
else:
    print('its not palindrome')

