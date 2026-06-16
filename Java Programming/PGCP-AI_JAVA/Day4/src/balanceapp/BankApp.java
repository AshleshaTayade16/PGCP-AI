package balanceapp;

import balanceapp.exception.AccountNotFoundException;
import balanceapp.exception.MinimumBalanceException;

import java.util.Scanner;

public class BankApp {
    Scanner sc=new Scanner(System.in);
    Account[] arr = new Account[5];

    public void createAccount() {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                arr[i] = new Account(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                break;
            }
        }
    }

    public void displayAllAccount() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
                System.out.println(arr[i].toString());
        }
    }

    public Account searchId(int id) throws AccountNotFoundException {
        for(Account ac: arr){
            if(id==ac.id){
                System.out.println(ac);
                return ac;
            }
        }
        return null;
    }

    public double deposite(int id,double amount) throws AccountNotFoundException {
        Account ac=searchId(id);
        ac.balance=ac.balance+amount;
        return ac.balance;
    }

    public double withdraw(int id,double amount)throws MinimumBalanceException, AccountNotFoundException{
        Account ac=searchId(id);
        if(ac.accountType.equals("Savings") && ac.balance-amount>=10000)
            ac.balance=ac.balance-amount;
        else if(ac.accountType.equals("Current") && ac.balance-amount>=25000)
            ac.balance=ac.balance-amount;
        return ac.balance;
    }

    public void transferAmount(){

    }

    public void closeAccount(int id) throws AccountNotFoundException {
//        Account ac= searchId(id);

        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==null && arr[i].id==id){
                arr[i]=arr[i+1];
                arr[i+1]=null;
            }
        }
    }

    public void menu(){
        boolean flag=true;
        do{
            System.out.println("----------BANKAPP MENU----------");
            System.out.println("1.Open Account\n" +
                    "2.Transaction\n" +
                    "3.Close Account\n" +
                    "0.Exit Process");
            int choice= sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        openAccountMenu();
                        break;
                    case 2:
                        transactionMenu();
                        break;
                    case 3:
                        closeAccountMenu();
                        break;
                    case 0:
                        flag = false;
                        System.out.println("Thank You!!!!");
                        break;
                    default:
                        System.out.println("Enter Valid Choice.........");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }while(flag);
    }

    public void openAccountMenu(){
        boolean flag=true;
        do{
            System.out.println("-------Open Account----------");
            System.out.println("1.Create Account(ID,Name,Balance,AccType(Current/Savings))\n" +
                    "2.Display Account Data\n" +
                    "3.Exit");
            System.out.print("Enter the choice: ");
            int choice= sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        displayAllAccount();
                        searchId(4);
                        break;
                    case 3:
                        flag = false;
                        System.out.println("Account Created....");
                        break;
                    default:
                        System.out.println("Invalid Choice!!!!!");
                }
            }
            catch (AccountNotFoundException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }while(flag);

    }

    public void transactionMenu(){
        boolean flag=true;
        do{
            System.out.println("-------Transactions----------");
            System.out.println("1.Transfer to Other Account\n" +
                    "2.Withdraw\n" +
                    "3.Deposite\n" +
                    "4.Exit");
            System.out.print("Enter the choice: ");
            int choice= sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        transferAmount();
                        break;
                    case 2:
                        System.out.print("Enter the Account id and amount: ");
                        int id = sc.nextInt();
                        double amount = sc.nextDouble();
                        System.out.println(withdraw(id, amount));
                        break;
                    case 3:
                        System.out.print("Enter the Account id and amount: ");
                        int id1 = sc.nextInt();
                        double amount1 = sc.nextDouble();
                        System.out.println(deposite(id1, amount1));
                        break;
                    case 4:
                        flag = false;
                        System.out.println("Transaction Done....");
                        break;
                    default:
                        System.out.println("Invalid Choice!!!!!");
                }
            }
            catch(AccountNotFoundException e){
                System.out.println(e.getMessage());
            }
            catch (MinimumBalanceException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(flag);
    }

    public void closeAccountMenu(){
        boolean flag=true;
        do{
            System.out.println("-------Closing Account----------");
            System.out.println("1.Close Account\n" +
                    "2.Search Data\n" +
                    "3.Exit");
            System.out.print("Enter the choice: ");
            int choice= sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the Account id: ");
                        int id1 = sc.nextInt();
                        closeAccount(id1);
                        break;
                    case 2:
                        System.out.print("Enter the Account id: ");
                        int id = sc.nextInt();
                        searchId(id);
                        break;
                    case 3:
                        flag = false;
                        System.out.println("Account Closed....");
                        break;
                    default:
                        System.out.println("Invalid Choice!!!!!");
                }
            }
            catch(AccountNotFoundException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(flag);
    }
}
