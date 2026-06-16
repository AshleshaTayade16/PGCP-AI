package exception;

public class Employee {
    String name,email;
    int age;

    public Employee(String name,String email,int age) throws CustomException {
        checkAge(age);
        this.name=name;
        this.email=email;
        this.age=age;

    }

    public void checkAge(int age) throws CustomException{
        if(age<25) {
            throw new CustomException();
        }
        else{
            System.out.println("Eligible");
        }

    }

}
