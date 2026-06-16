package day1.Assignment1;

import java.util.Scanner;

//find out the prime number
//from given input number by user
public class PrimeNumber {
    public boolean findPrimeNumber(int input){
        double squareroot = Math.sqrt(input);

        for(int i =2; i<=squareroot;i++){
            if(input % i ==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();

        PrimeNumber primeNumber=new PrimeNumber();
        boolean result=primeNumber.findPrimeNumber(input);

        if (result) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("not Prime number");
        }
    }

}
