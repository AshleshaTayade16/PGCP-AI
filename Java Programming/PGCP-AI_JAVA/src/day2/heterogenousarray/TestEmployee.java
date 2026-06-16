package day2.heterogenousarray;

public class TestEmployee {
    public static void main(String[] args){
        Employee[] staff=new Employee[4];

        staff[0] =new Engineer("Ashlesha", 1 ,500);
        staff[1] =new Manager("Ruchika", 2 ,"IT");

        staff[0].calculateSalary();
        staff[1].calculateSalary();

        System.out.println(staff[0]);
        System.out.println(staff[1]);
        //System.out.println(staff[0].equals(staff[1]));

        //for each
        for(Employee e :staff){
            if(e instanceof Engineer){
                System.out.println("Engineer");
                Engineer engineer = (Engineer) e;
                System.out.println(engineer.getIncentives());
            }
            else if(e instanceof Manager) {
                System.out.println("Manager");
                Manager manager =(Manager) e;
                System.out.println(manager.getprojects());
            }
            else{
                System.out.println("not defined");
            }
        }
    }
}
