package exception;

public class TestArithmeticException {
    public static void main(String[] args){
        try{
            int num=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
