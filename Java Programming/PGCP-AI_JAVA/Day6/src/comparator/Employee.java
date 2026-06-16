package comparator;

public class Employee {
    int id;
    String name;

    public Employee(int id,String name){
        this.name= name;
        this.id = id;
    }

    public int Id(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return getName()+" "+Id();
    }

    @Override
    public int hashCode() {
        System.out.println("called hashcode");
        return id;
    }

    @Override
    public boolean equals(Object obj1){
        System.out.println("Called equals");
        if(obj1!=null && obj1 instanceof Employee){
            Employee e =(Employee) obj1;
            if(this.id== e.id)
                return true;
        }
        return false;

    }


}
