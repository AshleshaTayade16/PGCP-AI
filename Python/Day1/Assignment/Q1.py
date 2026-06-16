# Q1.Using for loop, write and run a python program for this algo
# here is an algo to print out n! from 0! to 10!

n=int(input("Enter the Number: "))

i=1
for j in range(1,n+1):
    fact = 1
    for i in range(1,j+1):
        fact=fact*i
    print(fact)