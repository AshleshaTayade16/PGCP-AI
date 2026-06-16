package day2.testinterface;

public class TestInterface {
    public static void main(String[] args){
        fly fly=new Superman();
        fly.fly1();

        fly=new Airplane();
        fly.fly1();
    }
}
