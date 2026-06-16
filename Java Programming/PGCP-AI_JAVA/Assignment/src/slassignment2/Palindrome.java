package slassignment2;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number and string: ");
        int num=sc.nextInt();
        String str=sc.next();
        //for number
        int result=0,digit;
        int temp=num;
        while(temp!=0){
            digit=temp%10;
            result=result*10+digit;
            temp=temp/10;
        }
        if(num==result){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }

        //for string
        StringBuilder newStr=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            newStr.append(ch);
        }
        if(str.equals(newStr.toString())){
            System.out.println(str+" is palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");

        }
    }
}