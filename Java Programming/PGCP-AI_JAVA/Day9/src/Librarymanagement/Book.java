package Librarymanagement;

import java.util.List;

public class Book {
    String name;
    String author;
    int bookCount;



    public Book(){}

    public Book(String name, String author, int bookCount){
        this.name=name;
        this.author=author;
        this.bookCount=bookCount;
    }

    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getBookCount(){
        return this.bookCount;
    }

//    public List<Book> getBookData(){
//        return
//    }

    public void setBookCount(int count) {
        this.bookCount = count;
    }

    @Override
    public String toString(){
        return this.name+"\t"+this.author+"\t"+this.bookCount;
    }

}
