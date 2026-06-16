package Librarymanagement.exception;

public class OutOfStockException extends Exception{
    public OutOfStockException(){
        super("Book is Out of Stock!!!!");
    }
}
