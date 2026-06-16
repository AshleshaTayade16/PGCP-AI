package objectserilaization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
     transient String name;

    public Employee(int id,String name){
        this.name= name;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name;
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
