package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<Integer> newArrayList = new ArrayList<>();

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(60);
        arraylist.add(50);
        System.out.println(arraylist);

        newArrayList.add(100);
        newArrayList.add(200);
        newArrayList.add(300);
        System.out.println(newArrayList);

        arraylist.addAll(2, newArrayList);
        System.out.println(arraylist);

        arraylist.remove(3);
        System.out.println(arraylist);

        arraylist.add(4, 170);
        System.out.println(arraylist);

        arraylist.remove(1);
        System.out.println(arraylist);

//        arraylist.removeAll(arraylist);
//        System.out.println(arraylist);

        Collections.sort(arraylist);
        System.out.println(arraylist);

    }
}
