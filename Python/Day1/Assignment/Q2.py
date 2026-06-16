# Q2. Find the prime number between given range start(take start number), ene(take end number)
start = int(input('entered starting no:'))
end = int(input('entered ending no:'))

for i in range (start ,end+1):
    if i == 1:
        continue
    for j in range (2,i):
        if i%j == 0:
            break
    else:
        print(i)