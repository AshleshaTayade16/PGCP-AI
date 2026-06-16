'''Q.2 Create an Account class Heirarchy
Account with super class (acc_id, name, balance)
methods - withdraw and deposit

Create SavingsAccount as sub class of account - additional field (type - personal/corporate etc)
implement withdraw and deposit such that
- maximum upto 1 lakh can be deposited in an account at a time
- Min balance 5000 must be maintained while withdrawal (if type = corporate you withdraw full amount = balance)


Create CurrentAccount as sub class of account
implement withdraw and deposit such that
- maximum upto 2 lakh can be deposited in an account at a time
- Min balance 10000 must be maintained while withdrawal

Create Bank App with Transaction class
Create Method withdraw_from_account(account : Account)  and deposit_to_account(account : Account)
These methods will return the new balance after deposite/withdraw

Creare user class with user interface that gives 2 menu options
1. Deposit
2. Withdraw

Both options will ask user to enter money to withdraw/deposite
Display a statement with each transaction and final balance after user exits from the menu


Identify possible Exceptions and implement them'''

from abc import ABC, abstractmethod
from Exceptions import DepositLimitError, MinimumBalanceError, InsufficientBalanceError

class Account(ABC):
    def __init__(self,acc_id, name, balance):
        self.acc_id=acc_id
        self.name=name
        self.balance=balance
        self.transactions=[]

    def __str__(self):
        return f'{self.acc_id} {self.name} {self.balance}'

    def get_balance(self):
        return self.balance

    @abstractmethod
    def withdraw(self,amount):
        pass
    @abstractmethod
    def deposit(self,amount):
        pass

class SavingsAccount(Account):
    def __init__(self,acc_id, name, balance,account_type):
        super().__init__(acc_id, name, balance)
        self._account_type=account_type

    # def __str__(self):
    #     return f'{self._acc_id} {self._name} {self._balance} {self._account_type}'

    def withdraw(self,amount):
        if self._account_type=='corporate':
            if self.balance-amount>=5000:
                self.balance -=amount
            else:
                raise MinimumBalanceError(f'Min balance 5000 must be maintained...............')
        else:
            if self.balance-amount<0:
                raise InsufficientBalanceError('Insufficient balance')
            else:
                self.balance -= amount
        self.transactions.append(f'Withdrawn: {amount} Balance: {self.balance}')
        return self.balance

    def deposit(self,amount):
        if amount<=100000:
            self.balance += amount
            self.transactions.append(f'Deposited: {amount}  Balance: {self.balance}')
        else:
            raise DepositLimitError('Maximum upto 1 lakh can be deposited in an account at a time')
        return self.balance



class CurrentAccount(Account):
    def __init__(self, acc_id, name, balance):
        super().__init__(acc_id, name, balance)

    # def __str__(self):
    #     return f'{self._acc_id} {self._name} {self._balance}'

    def withdraw(self,amount):
        if self.balance-amount>=10000:
            self.balance -= amount
            self.transactions.append(f'Withdrawn: {amount} Balance: {self.balance}')
        else:
            raise MinimumBalanceError(f'Min balance 10000 must be maintained while withdrawal')
        return self.balance


    def deposit(self,amount):
        if amount<=200000:
            self.balance += amount
            self.transactions.append(f'Deposited: {amount}  Balance: {self.balance}')
        else:
            raise DepositLimitError('Maximum upto 2 lakh can be deposited in an account at a time')
        return self.balance

