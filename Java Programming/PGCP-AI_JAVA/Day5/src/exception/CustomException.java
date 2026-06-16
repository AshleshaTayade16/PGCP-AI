package exception;

public class CustomException extends Exception {
    public CustomException(){
        super("Age must be greater than 25");
    }
}
