package thread;

public class CustomeRunnable implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<5000;i++){
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread t1=new CustomeThread();
        t1.setName("MyThread");
        t1.run();
        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t1.sleep(1);
    }
}
