package singletonclass;

public class SingletonClass {
    int id;
    private static SingletonClass singletonClass=null;
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(singletonClass==null){
            singletonClass= new SingletonClass();
        }
        return singletonClass;
    }
}
