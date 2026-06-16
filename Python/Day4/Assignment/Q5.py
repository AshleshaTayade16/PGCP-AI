# Q.5
# 1. Find employees that know 'python'
# 2. Add a new skill - 'test' in skillset of all employees
# 3. Sort employees by skills
# for the given dictionary of employees
#
# emp_data = {'Amol': ['C', 'C++', 'Java'], 'Aditya': ['Angular', 'Java'],
#             'Aditi': ['Python', 'PHP', 'Database']}

emp_data = {'Amol': ['C', 'C++', 'Java'],
            'Aditya': ['Angular', 'Java'],
            'Aditi': ['Python', 'PHP', 'Database']}


know_python=list(filter(lambda x: 'Python' in emp_data[x],emp_data))
print(know_python)

# updated_dict=map(lambda key : emp_data[key].append('Test'),emp_data.keys())
# print(next(updated_dict))
# print(emp_data)

updated_dict =list(map(lambda item:{item[0]:[item[1] + ['Test']]},emp_data.items()))
print(updated_dict)
print(emp_data)

sorted_dict = dict(sorted(emp_data.items(), key=lambda x: x[1]))
print(sorted_dict)