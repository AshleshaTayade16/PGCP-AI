class Transaction:

    @staticmethod
    def withdraw_from_account(account,amount):
        balance=account.withdraw(amount)
        return balance

    @staticmethod
    def deposit_from_account(account,amount):
        balance = account.deposit(amount)
        return balance


