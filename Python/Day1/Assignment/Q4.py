# Q4.  Count digits, even/odd, sum
num = int(input('entered no:'))
total,count,even,odd= 0,0,0,0

while num!=0:
    digit = num%10
    count+= 1
    total = total+digit
    num = num//10
    if digit%2 == 0:
        even+=1
    else:
        odd+=1

print('digits:',count)
print('sum:',total)
print('even digits:',even)
print('odd digits:',odd)