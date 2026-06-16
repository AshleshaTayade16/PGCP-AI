package arraylist;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String []args){
        LinkedList<Integer> linkedList=new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList);

        linkedList.add(1,70);
        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList);
    }
}
