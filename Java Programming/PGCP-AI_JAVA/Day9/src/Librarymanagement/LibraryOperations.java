package Librarymanagement;

import Librarymanagement.exception.OutOfStockException;
import Librarymanagement.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class LibraryOperations {
    Scanner sc=new Scanner(System.in);
    Library lib=new Library();
    ArrayList<Student> studentList=new ArrayList<>();


    public void createStudent(){
        studentList.add(new Student(1,"Ashlesha"));
        studentList.add(new Student(2,"Sakshi"));
        studentList.add(new Student(3,"Ruchika"));
        studentList.add(new Student(4,"Sai"));

        System.out.println(studentList);

    }

    public void addBook(){
        lib.updateBookList(new Book("Java Programming","ABC",2));
        lib.updateBookList(new Book("Python","xyz",1));
        lib.updateBookList(new Book("HTML","abc",1));
        lib.updateBookList(new Book("Advanced Java","fgg",2));
        lib.updateBookList(new Book("C++ Programming","wjh",2));
        lib.updateBookList(new Book("C Programming","hh",2));

    }

    public void displayLibrary(){
        for(Book b: lib.getBooksList()){
            System.out.println(b);
        }
    }

    public void bookIssueToStudent() throws Exception {
//        try {
            System.out.print("Enter your name: ");
            String studentName = sc.next();
            sc.nextLine();

            Student foundStudent= null;
            for (Student s : studentList) {
                if (s.getName().equalsIgnoreCase(studentName)) {
                    foundStudent = s;
                    break;
                }
            }

            if (foundStudent == null) {
                throw new StudentNotFoundException();
            }

            System.out.print("Enter book name to issue: ");
            String bookName = sc.nextLine();

            Book foundBook = null;
            for (Book b : lib.getBooksList()) {
                if (b.getName().equalsIgnoreCase(bookName)) {
                    foundBook = b;
                    break;
                }
            }

            if (foundBook != null) {
                if (foundBook.getBookCount() > 0) {
                    foundStudent.setNewstudentList(foundBook);

                    foundBook.setBookCount(foundBook.getBookCount() - 1);
                    System.out.println(studentList);
                    System.out.println("SUCCESS: '" + bookName + "' has been issued to " + foundStudent.getName());
                } else {
                    throw new OutOfStockException();
                }
            } else {
                throw new Exception("ERROR: The book does not exist in our library.");
            }
//        }
//        catch(OutOfStockException e){
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        }

    public void returnBookByStudent() throws Exception {
//        try {
            System.out.print("\nEnter Student Name: ");
            String sName = sc.next();
            sc.nextLine();

//            for (Student s : studentList) {
//                if (s.getName().equalsIgnoreCase(sName)) {
//                    System.out.print("Enter Book Title to Return: ");
//                    String bName = sc.nextLine();
//
//                    if (s.bookName().equalsIgnoreCase(bName)) {
//
//                        for (Book b : lib.getBooksList()) {
//                            if (b.getName().equalsIgnoreCase(bName)) {
//                                s.RemoveBookNewstudentList(b);
//                                b.setBookCount(b.getBookCount() + 1);
//                                break;
//                            }
//                        }
//                        System.out.println("SUCCESS: Book returned.");
//
//                    } else {
//                        throw new Exception("ERROR: Student does not have this book.");
//                    }
//                    return;
//                }
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(sName)) {
                System.out.print("Enter Book Title to Return: ");
                String bName = sc.nextLine();

                // 1. Check if the student actually has this book
                if (s.hasBook(bName)) {

                    // 2. Remove from student's list
                    s.removeBookByName(bName);

                    // 3. Update the library's master book count
                    for (Book b : lib.getBooksList()) {
                        if (b.getName().equalsIgnoreCase(bName)) {
                            b.setBookCount(b.getBookCount() + 1);
                            break;
                        }
                    }
                    System.out.println("SUCCESS: Book returned.");
                    return;
                } else {
                    throw new Exception("ERROR: Student does not have this book.");
                }
            }
            throw new StudentNotFoundException();
        }
    }

    public void displayBookIssuedToStudentId() throws StudentNotFoundException {
//        try{
        System.out.print("Enter Student Id: ");
        int stdId= sc.nextInt();
        boolean flag=false;
        for(Student s: studentList){
            if(s.getId()==stdId){
                System.out.println(s.getNewstudentList());
                flag=true;
            }
        }
        if(!flag){
            throw new StudentNotFoundException();
        }
//    }
//        catch (StudentNotFoundException e){
//            System.out.println(e.getMessage());
//        }
    }

    public void menu() {
        int choice=-1;
            do {
                try {
                    System.out.println("---Library Management---");
                    System.out.println("1.Add Book\n" +
                            "2.Register Students\n" +
                            "3.Display Library Books\n" +
                            "4.Issue Book\n" +
                            "5.Return Book\n" +
                            "6.Get Issued Book Data of Student\n" +
                            "0.Exit");
                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            addBook();
                            break;
                        case 2:
                            createStudent();
                            break;
                        case 3:
                            displayLibrary();
                            break;
                        case 4:
                            bookIssueToStudent();
                            break;
                        case 5:
                            returnBookByStudent();
                            break;
                        case 6:
                            displayBookIssuedToStudentId();
                            break;
                        case 0:
                            System.out.println("Exited Successfully........!");
                            exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                }
                catch(OutOfStockException e){
                    System.out.println(e.getMessage());
                }
                catch(StudentNotFoundException e){
                    System.out.println(e.getMessage());
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }while (choice != 0) ;
    }
}
