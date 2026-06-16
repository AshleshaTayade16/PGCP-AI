emp_data={'Name':'Rudra',
          'Age':30,
          'Salary':80000,
          'Skills':['Java','Python','C++']}
capitals={'India':'New Delhi',
          'UK':'London',
          'France':'Paris',
          'Japan':'Tokyo'}
print(capitals['UK'])

for key,value in capitals.items():
    print(f'{key}-{value}')

for key in capitals.keys():
    print(f'{key}-{capitals.get(key)}')
    print(f'{key}-{capitals[key]}')

for value in capitals.values():
    print(value)

print('India'in capitals)
print('USA' not in capitals)

emp_data['phone number']='1234567895'
print(emp_data)
emp_data.update({'experience':10})
print(emp_data)
emp_data['experience']=8
print(emp_data)
emp_data.pop('experience')
print(emp_data)


nums=[1,2,3,4,5,6,7,8,9]
squares={num:num*num for num in nums}
print(squares)

def cal_discount(p):
    return p*0.8

books=[[123,'Python', 900],
       [333,'Java',444],
       [322,'JS',555]]

discounted={item[1]:cal_discount(item[2])
            for item in books}
print(discounted)
books={'Python':555,
       'Java':55,
       'JS':524}

discounted={key:cal_discount(value) for key, value in books.items()}
print(discounted)

books={'Python':555,
       'Java':55,
       'JS':524}

discounted={key:cal_discount(value) for book in books for key, value in books.items()}
print(discounted)