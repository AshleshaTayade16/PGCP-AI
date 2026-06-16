package arraylist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args){
      HashSet<Integer> hashSet = new HashSet<>();
//    TreeSet<Integer> hashSet = new TreeSet<>();
//    LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(156);
        hashSet.add(100);
        hashSet.add(102);

        System.out.println(hashSet);
    }




}
