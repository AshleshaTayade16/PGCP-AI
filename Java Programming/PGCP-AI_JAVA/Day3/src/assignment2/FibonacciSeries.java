package assignment2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value=sc.nextInt();

        int num1=0;
        int num2=1;
        System.out.print("Fibonacci Series: "+num1+" " +num2+ " ");
        for(int i=2; i<value ;i++){
            int sum= num1+num2;
            System.out.print(" " +sum+ " ");
            num1=num2;
            num2=sum;
        }
        sc.close();
    }
}
