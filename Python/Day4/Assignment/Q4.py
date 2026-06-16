# # Q.4.Create series of 'n' prime numbers and display first 10 using generator

n = int(input('Enter the number of prime numbers: '))

def prime_generator(n):
    count = 0
    num = 2
    while count < n:
        flag = True
        for i in range(2, num):
            if num % i == 0:
                flag = False
                break
        if flag:
            yield num
            count += 1
        num += 1

gen = prime_generator(n)
for i in range(n):
    print(next(gen))