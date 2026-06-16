package menudriven;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String name;
    double balance ;
    String password;

    public User(int id,String name, double balance,String password){
        this.id=id;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getPassword(){
        return this.password;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setPassword(String password){
        this.password=password;
    }

//    @Override
//    public int hashCode() {
////        System.out.println("called hashcode");
//        return id;
//    }

    @Override
    public boolean equals(Object obj1){
//        System.out.println("Called equals");
        if(obj1!=null && obj1 instanceof User){
            User e =(User) obj1;
            if(this.name.equals(e.name) && this.password.equals(e.password))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.balance+" "+this.password;
    }

}
