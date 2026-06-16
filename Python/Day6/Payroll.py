from EmployeePortal import (Employee ,SalariedEmployee,Manager,ContractBasis)
class Payroll:
    @staticmethod
    def display_gross(employee:Employee):
        print(employee.calculate_gross())
    @staticmethod
    def display_net(employee :SalariedEmployee):
        print(employee.calculate_net())

se = SalariedEmployee(819,'abc',8000 ,'GGKHJJ1123')
me=Manager(35,'ghvc',10000,'4111',4000)
we=ContractBasis(23,'ghfg',34,500)

print(se)
Payroll.display_gross(se)
Payroll.display_net(se)
print('-----------------------------')
print(me)
Payroll.display_gross(me)
Payroll.display_net(me)
print('-----------------------------------')
print(we)

