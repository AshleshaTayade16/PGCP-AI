package comparator;

import comparator.TestComparator;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args){

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(4,"dfg"));
        employeeList.add(new Employee(3,"aash"));
        employeeList.add(new Employee(6,"ash"));

        System.out.println("before sorting");
        System.out.println(employeeList);

        System.out.println("after sorting");
        Collections.sort(employeeList,new TestComparator());
        System.out.println(employeeList);

    }
}
