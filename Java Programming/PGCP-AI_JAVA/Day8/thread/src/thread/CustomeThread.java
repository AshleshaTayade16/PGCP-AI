package thread;

public class CustomeThread extends Thread{
    @Override
    public static void main(String[] args)throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread();
        t1.setName("MyThread");
        t1.run();
        Thread.sleep(1000);


    }

}
