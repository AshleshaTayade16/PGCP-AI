package day2.accessspecifier;

public class Employee {
    public String name;
    private int salary;
    protected String department;
    float incentive;

    public Employee(String name,int salary, String department,float incentive){
        this.name = name;
        this.salary =salary;
        this.department=department;
        this.incentive=incentive;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public void setIncentive(int incentive)
    {
        this.incentive=incentive;
    }

    @Override
    public String toString()
    {
        return this.name + " "+ this.salary+" "+ this.department+" "+this.incentive;
    }
}
