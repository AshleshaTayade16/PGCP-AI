package balanceapp.exception;

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(){
        super("Account Not Found");
    }
}
