package generics;

public class GenericsClass {

    static class NewClass<T>{
        T object;

        NewClass(T object) {
        }

        public T getObject(){
            return this.object;
        }}

    public static void main(String[] args) {
        NewClass<Integer>object=new NewClass<>(5);
        System.out.println(object.getObject());
        System.out.println(object.getClass().getSimpleName());

        NewClass<String>object1=new NewClass<>("5");
        System.out.println(object1.getObject());
        System.out.println(object1.getClass().getSimpleName());
    }
}