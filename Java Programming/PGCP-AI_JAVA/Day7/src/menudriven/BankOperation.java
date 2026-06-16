package menudriven;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

import static java.lang.System.exit;

public class BankOperation{
    Scanner sc = new Scanner(System.in);
    ArrayList<User> userList = new ArrayList<>();
    public void createUser() {
//        userList.add(new User(1,"Ashlesha",50000,encrypt("ashlesha")));
//        userList.add(new User(2,"Ruchika",60000,encrypt("ashlesha")));
//        userList.add(new User(3,"Ashlesha",50000,encrypt("ashlesha")));
        userList.add(new User(sc.nextInt(), sc.next(),sc.nextDouble(),encrypt(sc.next())));
        serialize(userList);
    }

    public void serialize(ArrayList<User> userList){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("outfile1.ser")))){
            oos.writeObject(userList);
            oos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("outfile1.ser")))){

            Object o = ois.readObject();
            userList = (ArrayList<User>)o;
            System.out.println(userList);
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public String encrypt(String password){
    StringBuilder sb = new StringBuilder(password);

    for(int i = 0; i < sb.length(); i++) {
        char shiftedChar = (char) (sb.charAt(i) << 2);
        sb.setCharAt(i, shiftedChar);
    }
        password = sb.toString();

        return password;
    }

    public String decrypt(String password){
        StringBuilder sb = new StringBuilder(password);

        for(int i = 0; i < sb.length(); i++) {
            char shiftedChar = (char) (sb.charAt(i) >> 2);
            sb.setCharAt(i, shiftedChar);
        }
        password = sb.toString();
        return password;
    }

    public void login(String userName, String password){

            for (User u : userList) {
                if(u.name.equals(userName)){
                    String decryptedPass= decrypt(u.password);
                    if(decryptedPass.equals(password)){
                        System.out.println("Login Successfully");
                    }
                    else{
                        System.out.println("Failed!!!!!!");
                    }
                }
        }
    }

    public void menu(){
        int choice;
        do{
            System.out.println("-------BANKMENU---------");
            System.out.println("1.Create User\n" +
                    "2.Login Account\n" +
                    "3.Exit");
            System.out.print("Enter the choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    createUser();
                    break;
                case 2:
                    String userName,password;
                    System.out.print("Enter Username: ");
                    userName=sc.next();
                    System.out.print("Enter Password: ");
                    password=sc.next();
                    login(userName,password);
                    break;
                case 3:
                    System.out.println("Exited Successfully.......");
                    exit(0);
                    break;
                default:
                    System.out.println("Enter Valid Input!!!!");
            }
        }while(choice!=0);
   }
}
