package objectserilaization;

import java.io.*;
import java.util.ArrayList;

public class ArrayObjectSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee e = new Employee(1, "ash");
        Employee e1 = new Employee(2, "ash");
        Employee e2 = new Employee(2, "asgfgz");

        arrayList.add(e);
        arrayList.add(e1);
        arrayList.add(e2);

        FileOutputStream fos = new FileOutputStream(("outfile.ser"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(arrayList);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream(("outfile.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        ArrayList<Employee> newEmployee = (ArrayList<Employee>)o;
        System.out.println(newEmployee);
    }
}
