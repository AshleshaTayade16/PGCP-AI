package balanceapp.exception;

public class MinimumBalanceException extends Exception{

    public MinimumBalanceException(){
        super("Insufficient Balance....");
    }
}
