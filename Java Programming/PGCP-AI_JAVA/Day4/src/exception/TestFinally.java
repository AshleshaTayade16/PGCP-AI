package exception;

public class TestFinally {
    public void fun() throws ArithmeticException{
        System.out.println(10/0);
        throw new ArithmeticException("yuuytf");
    }
    public static void main(String[] args){
        TestFinally t=new TestFinally();
        try{
            t.fun();
        }
        catch(ArithmeticException e){
            System.out.println();
        }
        finally{
            System.out.println("Logic");
        }
    }
}
