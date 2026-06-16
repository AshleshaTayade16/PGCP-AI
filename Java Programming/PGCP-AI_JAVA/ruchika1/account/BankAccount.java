//2. Method Overloading & Constructors
//Create a class BankAccount with:
//        - Overloaded constructors (default, parameterized).
//        - Overloaded methods deposit() for both int and double.
//        - Demonstrate constructor chaining using this().


package ruchika.account;

public class BankAccount {
    int id;
    String  name;
    int balance;

    public BankAccount(int id,String name,int balance){
        this.id= id;
        this.name= name;
        this.balance=  balance;
    }
    public BankAccount(){
        this(0,"ghlk",0);

    }

    public int deposit(int amount){
        return this.balance+=amount;
    }

    public double deposit(double amount){
        return this.balance+=amount;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name +" "+this.balance;
    }




}
