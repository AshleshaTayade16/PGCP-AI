#Q1. Define a function overlapping () that takes two lists and returns True if they have at
# least one member in common, False otherwise.

lst1=input('Enter First List: ').split(' ')
lst2=input('Enter Second List: ').split(' ')

def overlapping(list1,list2):
    for i in range(0,len(list1)):
        for j in range(0,len(list2)):
            if list1[i]==list2[j]:
                return True
    return False
print(lst1)
print(lst2)
print(overlapping(lst1,lst2))