package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsCollection {
    public static void main(String[] args) {
        ArrayList<String> sAl = new ArrayList<>();
        sAl.add("7");

        ArrayList al = new ArrayList<>();
        al.add(5);
        al.add("5");

        System.out.print(al);
        System.out.println(sAl);

    }

}