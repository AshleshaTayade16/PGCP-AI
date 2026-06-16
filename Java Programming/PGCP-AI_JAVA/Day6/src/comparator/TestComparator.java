package comparator;

import java.util.Comparator;

public class TestComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
//        return o1.id-o2.id;
//        return o2.id-o1.id;
        return o1.name.hashCode()-o2.name.hashCode();
    }
}
