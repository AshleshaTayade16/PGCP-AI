package day1.Array;
import java.util.Scanner;

public class StringArray {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num=sc.nextInt();
        String []studentName= new String[num];

        //Take input from user
        System.out.println("Enter the elements: ");
        for(int i=0;i<studentName.length;i++){
            studentName[i]=sc.next();
        }
        //Print array elements
        for(int j =0;j<studentName.length;j++)
        {
            System.out.println("Index "+j+" element: "+studentName[j]);
        }
        sc.close();
    }
}
