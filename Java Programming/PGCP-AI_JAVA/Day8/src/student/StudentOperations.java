package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.exit;

public class StudentOperations {
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> studentList=new ArrayList<>();

    public void takeStudentData(){
        System.out.println("Enter Id,Name,Date(YYYY-MM-DD),Percentage");
//        Student student=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
//        studentList.add(student);

        studentList.add(new Student(1,"lkllsh","2000-12-12",78));
        studentList.add(new Student(5,"ashlesha","2000-12-12",40));
        studentList.add(new Student(7,"shhjf","2000-12-12",32));
        studentList.add(new Student(9,"ahfj","2000-12-12",77));
        studentList.add(new Student(6,"hfef","2000-12-12",12));
        studentList.add(new Student(2,"jkkj","2000-12-12",78));
        System.out.println(studentList);
    }

    public String result(double percentage){
        if(percentage>=40){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    public void finalResult(){
        for(Student s: studentList){
            String result=result(s.percentage);
            s.setResult(result);
        }
    }

    public void displayData(){
        for(Student s: studentList){
            System.out.println(s);
        }
    }

    public void displaySortedData(){
        Collections.sort(studentList, new TestComparator());
        for(Student s: studentList){
            System.out.println(s);
        }
    }


    public void menu(){
        int choice;
        do{
            System.out.println("---------STUDENT MENU----------");
            System.out.println("1.Create Student Data\n" +
                    "2.Display Student Result Data\n" +
                    "3.Display Sorted Data\n" +
                    "4.Exit");
            System.out.print("Enter the choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    takeStudentData();
                    break;
                case 2:
                    finalResult();
                    displayData();
                    break;
                case 3:
                    displaySortedData();
                    break;
                case 4:
                    System.out.println("Exited Successfully...........");
                    exit(0);
                default:
                    System.out.println("Enter Valid Input!!!!!!");
            }
        }while(choice!=4);
    }
}
