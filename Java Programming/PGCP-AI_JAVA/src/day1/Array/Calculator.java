package day1.Array;
import java.util.Scanner;
import static java.lang.System.exit;

public class Calculator {
        public double add(double num1, double num2){
            return num1+num2;
        }
        public double sub(double num1, double num2){
            return num1-num2;
        }
        public double mul(double num1, double num2){
            return num1*num2;
        }
        public double div(double num1, double num2){
            return num1/num2;
        }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        double num1,num2;
        Calculator cal= new Calculator();

        do {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multilication");
            System.out.println("4.Division");
            System.out.println("0.Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter first number: ");
                    num1= sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2= sc.nextDouble();
                    double addition= cal.add(num1,num2);
                    System.out.println("Addition: " + addition);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1= sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2= sc.nextDouble();
                    double substraction= cal.sub(num1,num2);
                    System.out.println("Subtraction: " + substraction);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1= sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2= sc.nextDouble();
                    double multiplication= cal.mul(num1,num2);
                    System.out.println("Multiplication: " + multiplication);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1= sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2= sc.nextDouble();
                    double division= cal.div(num1,num2);
                    System.out.println("Division: " + division);
                    break;
                case 0:
                    System.out.println("Successfully Exited!!!!!");
                    exit(0);
                default:
                    System.out.println("Invalid Input.........");
            }
        }while(cal!=null);
        sc.close();
    }
}
