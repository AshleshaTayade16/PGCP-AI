package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args){
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10) ;
        arrayList.add(20) ;
        arrayList.add(30) ;

        Iterator<Integer> iterator = arrayList.iterator();
//        for(Integer i :arrayList)
//            System.out.println(i);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();

        }
        System.out.println(iterator);
    }

}
