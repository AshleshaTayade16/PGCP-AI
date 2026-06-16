package restaurant;

import java.util.Scanner;

public class TestRestaurant {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;
        Restaurant rst=new Restaurant();

        do{
            System.out.println("1.Order Items\n" +
                    "2.Generate bill\n" +
                    "3.Order Again\n" +
                    "0.Exit");
            System.out.print("Enter the choice: ");
            int choice= sc.nextInt();
           switch(choice){
               case 1:
                   rst.selectOrder();
                   break;
               case 2:
                   System.out.println("Total Bill: "+rst.generateBill());
                   break;
               case 3:
                   rst.selectOrder();
                   break;
               case 0:
                   System.out.println("Exited Successfully.....");
                   break;
               default:
                   System.out.println("Enter Valid Input!!!!!!");

           }
        }while(rst!=null);
    }
}
