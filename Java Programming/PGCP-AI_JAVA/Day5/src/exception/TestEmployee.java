package exception;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String []args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        try(sc){
//            Employee e =new Employee("Ruchika","cfhgs@123",20);
            Employee e =new Employee(sc.next(),sc.next(),sc.nextInt());
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
