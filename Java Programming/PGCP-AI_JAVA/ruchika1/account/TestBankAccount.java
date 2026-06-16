package ruchika.account;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount(1,"ery",12300);

        System.out.println(bankAccount);
        bankAccount.deposit(10000);
        System.out.println(bankAccount);

        BankAccount bankAccount1= new BankAccount();
        System.out.println(bankAccount1);
    }

}
