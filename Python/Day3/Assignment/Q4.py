t1 =(1,2,3,4)
t2 =(3,5,2,1)
t3 =(2,2,3,1)

print(t1)
print(t2)
print(t3)

temp_tuple = []

for a, b, c in zip(t1, t2, t3):
    temp_tuple.append(a+b+c)

result = tuple(temp_tuple)
print('Sum of tuples: ',result)


