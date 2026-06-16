package ruchika;

public class student {
    int id;
    String name;

    public student(int id,String name){
        this.id=id;
        this.name = name;

    }

    @Override
    public String toString(){
        return this.id +" "+this.name;
    }
}
