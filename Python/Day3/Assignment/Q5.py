t1=(1,2,3)
t2=(2,3,4)
temp_tuple=[]
print(t1)
print(t2)
for a in t1:
    for b in t2:
        if a==b:
            temp_tuple.append(a)

print(temp_tuple)