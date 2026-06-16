package Librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
//    List<String> studentbookList= new ArrayList<>();
    List<Book> newstudentList=new ArrayList<>();
    public Student(){}

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public List<Book> getNewstudentList(){
        return this.newstudentList;
    }

//    public List<String> getStudentbookList(){
//        return this.studentbookList;
//    }

//    public void setStudentbookList(String book){
//        this.studentbookList.add(book);
//    }
        public void setNewstudentList(Book b){
            newstudentList.add(new Book(b.getName(),b.getAuthor()));
        }
//        public String bookName(){
//            return this.getBookName();
//        }
//    public void RemoveBookNewstudentList(Book b){
//        newstudentList.remove(b);
//    }
public boolean hasBook(String bookName) {
    for (Book b : newstudentList) {
        if (b.getName().equalsIgnoreCase(bookName)) {
            return true;
        }
    }
    return false;
}

    // Remove the book by name to avoid reference issues
    public void removeBookByName(String bookName) {
        newstudentList.removeIf(book -> book.getName().equalsIgnoreCase(bookName));
    }

    @Override
    public String toString(){
        return this.id+"\t"+this.name+"\t"+this.newstudentList;
    }
}
