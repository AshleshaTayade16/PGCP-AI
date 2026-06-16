package day2.heterogenousarray;

public class Engineer extends Employee {
    int salary;
    int incentives ;

    Engineer(String name ,int id,int incentives){
        super(name,id);
        this.incentives= incentives;
    }
    public int getIncentives(){
        return this.incentives;
    }

    @Override
    public void calculateSalary() {
        this.salary = 1000* id +incentives;

    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary+" " + this.incentives;
    }
}
