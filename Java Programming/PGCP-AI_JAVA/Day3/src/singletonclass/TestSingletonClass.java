package singletonclass;

public class TestSingletonClass {
    public static void main(String[] args){
        SingletonClass sc=SingletonClass.getInstance();
        SingletonClass sc1=SingletonClass.getInstance();

        sc.id=10;
        System.out.println(sc.id);
        sc1.id=20;
        System.out.println(sc1.id);
        System.out.println(sc.id);

        //same hashcodes
        System.out.println(sc);
        System.out.println(sc1);

    }
}
