elements=int(input('Enter the number of words in the list: '))
list=[]
longLength=0
for i in range(0,elements):
    list.append(input(f'Word {i+1}: '))
    if len(list[i])>longLength:
        longLength=len(list[i])
print(list)
print('Length of the longest word in the list: ',longLength)

