package exception;

public class MultipleCatch {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            System.out.println(args[0]);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array size issue");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}
