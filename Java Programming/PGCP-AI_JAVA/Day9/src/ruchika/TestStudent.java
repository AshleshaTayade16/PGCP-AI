package ruchika;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        student st = new student(1,"ert");

//        int id;
//        id=sc.nextInt();
        System.out.println("Enter no");
        int id=sc.nextInt();
        System.out.println("Enter string");
        String name= sc.next();
//        System.out.println(id);

        student st1=new student(id,name);
        student st2=new student(sc.nextInt(), sc.next());
//        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);
    }
}
