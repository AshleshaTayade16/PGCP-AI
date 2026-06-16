package student;

import java.util.Comparator;

public class TestComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        int resultCompare = s1.result.compareTo(s2.result);
        if (resultCompare !=0) {
            return resultCompare;
        }
        return s1.name.compareTo(s2.name);
    }
}
