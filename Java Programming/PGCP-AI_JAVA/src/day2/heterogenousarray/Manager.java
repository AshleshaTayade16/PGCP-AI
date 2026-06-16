package day2.heterogenousarray;

public class Manager extends Employee {
    String projects;

    Manager(String name ,int id,String projects){
        super(name,id);
        this.projects= projects;
    }

    public String getprojects(){
        return this.projects;
    }

    @Override
    public void calculateSalary() {
        this.salary = 5000 * id ;

    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary+" " + this.projects;
    }
}
