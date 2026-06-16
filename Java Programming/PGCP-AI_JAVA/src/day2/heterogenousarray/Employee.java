package day2.heterogenousarray;

public  abstract class Employee {
    String name ;
    int id;
    float salary;

    public Employee (String name,int id){
        this.name= name;
        this.id = id;
    }

    public abstract void calculateSalary();
    @Override
    public String toString(){
        return name +" " + id +" ";
    }
//    @Override
//    public boolean equals(Object obj1){
//        if(obj1 !=null && obj1 instanceof Employee){
//            Employee e =(Employee) obj1;
//            if (this.id == e.id && this.name.equals(e.name))
//                return true;
//        }
//        return false;
//    }
}

