package day1.Array;

public class Arrayhandling {
    public static void main(String [] args){
        int iArray[]= new int[5];
        //int iArray[]={10,20,30};
        //String strArray[]= new String[10]
        int j =10;

        for(int i =0;i<iArray.length;i++)
        {
            iArray[i] =j++;
        }
        System.out.println(iArray);

        for(int i =0;i<iArray.length;i++)
        {
           System.out.println(iArray[i]);
        }
    }
}
