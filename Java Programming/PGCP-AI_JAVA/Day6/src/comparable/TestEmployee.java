package comparable;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args){

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(3,"ash"));
        employeeList.add(new Employee(3,"ash"));
        employeeList.add(new Employee(6,"ash"));

        System.out.println("before sorting");
        System.out.println(employeeList);

        System.out.println("after sorting");
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}

