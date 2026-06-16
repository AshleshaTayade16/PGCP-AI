from abc import ABC,abstractmethod
from Taxpayer import TaxPayer
class Employee(ABC):
    def __init__(self,empid,name):
        self._empid = empid
        self._name = name

        @abstractmethod
        def calculate_gross(self):
            pass

        def __str__(self):
            return f'{self._empid} {self._name}'

class SalariedEmployee(Employee,TaxPayer):
    def __init__(self,empid,name, basic,panid):
        #super().__init__(empid,name)
        #self._empid = empid
        #self._name = name
        #super().__init__(pan)
        Employee.__init__(self,empid,name)
        TaxPayer.__init__(self,panid)
        self._basic=basic

    def calculate_gross(self):
        hra=self._basic*0.4
        da=self._basic*0.2
        return self._basic+hra+da

    def calculate_net(self):
        gross=self.calculate_gross()
        pf=gross*0.12
        return gross-pf

    def __str__(self):
        return f'{self._empid} {self._name} {self._basic}'

class ContractBasis(Employee):
    def __init__(self,empid,name,days,perdaypay):
        super().__init__(empid,name)
        self._days=days
        self._perdaypay=perdaypay

    def __str__(self):
        return f'{self._empid} {self._name} {self._days} {self._perdaypay}'

    def calculate_gross(self):
        return self._days*self._perdaypay


class Manager(SalariedEmployee):
    def __init__(self,empid,name,basic,panid,incentive):
        super().__init__(empid,name,basic,panid)
        self._incentive=incentive

    def __str__(self):
        return f'{self._empid} {self._name} {self._basic} {self._incentive}'

    def incentives(self):
        return self.calculate_net()+self._incentive




e1=SalariedEmployee(1,'Sakshi',45000)
e2=ContractBasis(2,'Sakshi',45,500)
e3=Manager(3,'Ashlesha',40000,4000)

print(e1)
print(e1.calculate_gross(),' ',e1.calculate_net())
print(e2)
print(e2.calculate_gross())
print(e3)
print(e3.incentives())


