elements=int(input('Enter the number of words in the list: '))
list=[]

for i in range(0,elements):
    list.append(input(f'Word {i+1}: '))
print('Before list:',list)
n=len(list)
i=0
while i<n:
    j=i+1
    while j<n:
        if (list[i] == list[j]):
            list.pop(j)
            n=len(list)
            continue
        j+=1
    i+=1
print('After list:',list)

