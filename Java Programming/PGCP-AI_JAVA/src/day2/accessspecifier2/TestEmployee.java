package day2.accessspecifier2;
import day2.accessspecifier.Employee;

public class TestEmployee extends Employee{
    public TestEmployee(){
        super("Ruchika",40000,"Sales",7000);
    }
    public static void main(String []args){
//        Employee emp= new Employee("Ashlesha",50000, "IT", 2000);
//        System.out.println(emp);
        TestEmployee emp1=new TestEmployee();
        System.out.println(emp1);

        emp1.setDepartment("Finance");
        emp1.setIncentive(5000);
        System.out.println(emp1);
    }
}
