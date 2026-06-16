#Q1.Write a program that asks the user how many days in a particular month, and
#what day of the week the month begins on (0 for Monday, 1 for Tuesday,etc), and then prints a calendar
#for that month. For month. for example, here is the output for a 30-day month that begins on day3(Thursday):

days=int(input('Enter the number of days in month: '))
weekDay=int(input('Day of the week the month begins on: '))

count=0
print('M\tT\tW\tT\tF\tS\tS')

for index in range(0,weekDay):
    print(end='\t')
    count+=1

for i in range(1,days+1):
    print(i, end='\t')
    count += 1
    if count%7==0:
        print(end='\n')