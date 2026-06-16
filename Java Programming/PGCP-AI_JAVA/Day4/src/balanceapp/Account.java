package balanceapp;

public class Account {
    int id;
    String name,accountType;
    double balance;
    final double savingMinBlance=10000,currentMinBalance=25000;

    public Account(int id,String name ,double balance,String accountType){
        this.id= id;
        this.name= name;
        this.balance= balance;
        this.accountType=accountType;
    }

    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.balance+" "+this.accountType;

    }
}
