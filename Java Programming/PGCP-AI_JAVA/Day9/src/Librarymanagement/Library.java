package Librarymanagement;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> booksList= new ArrayList<>();

    public Library(){}

    public void updateBookList(Book b){
        this.booksList.add(b);
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    @Override
    public String toString(){
        return booksList.toString();
    }
}
