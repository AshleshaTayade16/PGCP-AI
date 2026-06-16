package day1.primitivedatatype;

public class PrimitiveDataType {
    public static void main(String[] args){
        int i=5;
        float f= 5.5f;
        double d = 5.5;
        System.out.println(f);
        System.out.println(d);
        //i+=5;
        System.out.println(i+5);
        //System.out.println("i = "+i+5);

        char  a= 'a';
        String s1= "Aashish";
        String s2 = "Aashish";
        String s3= new String("Aashish");
        String s4= new String("Aashish");
        System.out.println(s1==s2);
        System.out.println(s4==s3);
        System.out.println(s4.equals(s3));

        if (s4 == s3){
            System.out.println("Equal");
        }
        else
            System.out.println("Not equal");

    }
}
