package assignment2;
import java.util.Scanner;

public class PascalTraingle {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= sc.nextInt();

        for(int i=0;i<row;i++){
            int val=1;
            for(int space=1;space<=row-i-1;space++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    val = 1;
                else
                    val = val * (i - j + 1) / j;
                System.out.print(val + " ");
            }
                System.out.println();
            }
        sc.close();
        }
    }

