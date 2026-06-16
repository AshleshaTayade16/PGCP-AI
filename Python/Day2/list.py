words=['one','two','three','four','nine']

for word in words:
    print(word)

print(len(words))
print('one' in words)
print('ten' not in words)

print('indexing & slicing')
print(words[3])
print(words[-2])
# print(words[5]) #IndexError
print(words[2:4])
print(words[1:4:2])
print(words[4:1])
print(words[4:1:-1])
print(words[::-1])
print(words[:2]+words[2:])

print('-------------------Methods-----------------')
words.append('five')
print(words)
words.remove('three')
print(words)
words.insert(2,'six')
print(words)
index=words.index('one')
print(index)
words.sort()
print(words)
lst=['eleven','twelve']
lst1=['a','b','c']
words.append(lst1)
print(words)
words.extend(lst)
print(words)
words.pop(3)
print(words)
words.reverse()
print(words)

for word in words:
    if isinstance(word,list):
        for item in word:
            print(item)
    else:
        print(word)

for i,j in enumerate(words):
    print(i, ' ',j)
books=[[123,'Python',333],
       [111,'Java',444],
       [333,'React',555]]
for isbn,title,price in books:
    print(f'{isbn}-{title}-{price}')