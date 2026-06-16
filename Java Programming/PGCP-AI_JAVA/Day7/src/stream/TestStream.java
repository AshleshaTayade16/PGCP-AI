package stream;

import java.util.Arrays;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List list= Arrays.asList("Java","Python","C++");
        list.stream().forEach(System.out::println);

        List names = Arrays.asList("Afg","ert","abc");
        names.stream().filter(n->n.toString().startsWith("A")).forEach(System.out::println);

    }
}
