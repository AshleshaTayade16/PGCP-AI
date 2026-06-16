import pickle
import re
# from EmployeePortal import SalariedEmployee,Manager,ContractBasis
#
# e1=SalariedEmployee(1,'Sakshi',45000)
# e2=ContractBasis(2,'Sakshi',45,500)
# e3=Manager(3,'Ashlesha',40000,4000,5000)
#
# employees =[e1,e2,e3]
# employee_data =[]
# # with open('employee_data.pickle','wb') as fw:
#     # try:
#         # for employee in employees:


phone ='+91 12345 12345'
pattern =r'\+91\s\d{5}\s\d{5}'
is_valid=bool(re.match(pattern,phone))
print(is_valid)

message ="good morning have a good day"
match = bool (re.search(r'good',message))
print(match)

match = re.search(r'good',message)
if match:
    print(match.span())
    print(match.group())
else:
    print('no match')

print(re.findall(r'good',message))

words = "sit wit chit that fat pit it fit unit"

print(bool(re.search(r'^sit',words)))
print(bool(re.search(r'unit$',words)))

pattern = r'\b[a-z]*it\b'
print(re.findall(pattern,words))

pattern = r'\b[a-z]?it\b'
print(re.findall(pattern,words))

pattern = r'\b[a-z]+it\b'
print(re.findall(pattern,words))

pattern =r'\b\w{1}it\b'
print(re.findall(pattern,words))

rules = "a b z T Y 0 6 7 ^ &*"