from Account import SavingsAccount,CurrentAccount
from Transaction import Transaction
from Exceptions import *

accounts={
101: CurrentAccount(101,'Ashlesha',60000),
102: CurrentAccount(102,'Sakshi',40000),
103: SavingsAccount(103,'Akash',40000,'personal'),
104: SavingsAccount(104,'Prasad',7000,'corporate'),
105: SavingsAccount(105,'Pratik',60000,'personal')
}
try:
    acc_no=int(input("Enter Account Number: "))
    if acc_no not in accounts:
        raise InvalidAccountNumberError("Invalid Account Number")

    acc_list=accounts[acc_no]
    t=Transaction()
    flag=True

    while flag:
        print("\n---BANK ACCOUNT---")
        print("1. Deposit")
        print("2. Withdraw")
        print("3. Exit")

        # amount=int(input('Enter amount which you want to withdraw or deposit: '))
        choice = int(input("\nSelect an option (1-3): "))
        try:
            match choice:
                case 1:
                    amount = int(input('Enter amount to deposit: '))
                    bal=t.deposit_from_account(acc_list,amount)
                    print('Deposit Successful......')
                    print("Current Balance: ",bal)
                case 2:
                    amount = int(input('Enter amount to withdraw: '))
                    bal=t.withdraw_from_account(acc_list,amount)
                    print('Withdraw Successful......')
                    print("Current Balance: ",bal)
                case 3:
                    flag=False
                    print('Transaction Statement')
                    print('Account Number: ',acc_list.acc_id)
                    print('Name: ',acc_list.name)
                    if len(acc_list.transactions)==0:
                        print("No transactions done")
                    else:
                        for i in acc_list.transactions:
                            print(i)
                    print("Final Balance: ",acc_list.get_balance())
                    print('Thank you for Banking!!!')
                case _:
                    print("Invalid option. Please choose 1, 2, or 3.")

        except DepositLimitError as e:
            print("Error:", e)

        except MinimumBalanceError as e:
            print("Error:", e)

        except InsufficientBalanceError as e:
            print("Error:", e)

        except Exception as e:
            print("Unexpected Error:", e)

except InvalidAccountNumberError as e:
    print("Error: ",e)
except ValueError:
    print("Invalid input! Please enter numbers only.")