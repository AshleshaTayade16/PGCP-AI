package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestEmployee {
    public static void main(String[] args){
        Set<Employee> set1=new HashSet<>();
        Employee e=new Employee(1,"ash");
        Employee e1=new Employee(2,"ash");
        Employee e2=new Employee(2,"asgfgz");


        set1.add(e);
        set1.add(e1);
        set1.add(e2);
        System.out.println(set1);
    }
}
