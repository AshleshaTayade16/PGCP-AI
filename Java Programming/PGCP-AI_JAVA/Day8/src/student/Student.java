package student;

import java.time.LocalDate;
import java.util.Comparator;

public class Student {
    int id;
    String name;
    double percentage;
    LocalDate birthDate;
    String result;

    public Student(int id, String name, String dob, double percentage){
        this.id = id;
        this.name= name;
        this.percentage= percentage;
        this.birthDate = LocalDate.parse(dob);
        this.result="Pending";
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public LocalDate getBirthDate(){
        return this.birthDate;
    }
    public double getPercentage(){
        return this.percentage;
    }
    public void setResult(String result){
        this.result=result;
    }

    public String toString(){
        return this.id+" "+this.name+" "+this.birthDate+" "+this.percentage+" "+this.result;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

//    @Override
//    public boolean equals(Object obj1){
////        System.out.println("Called equals");
//        if(obj1!=null && obj1 instanceof Student){
//            Student e =(Student) obj1;
//            if(this.id==e.id)
//                return true;
//        }
//        return false;
//    }



}
