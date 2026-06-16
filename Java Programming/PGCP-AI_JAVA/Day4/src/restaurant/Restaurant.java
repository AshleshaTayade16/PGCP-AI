package restaurant;

import java.util.Scanner;

import static java.lang.System.exit;

public class Restaurant {
//    public enum items {
//        POHA(20),
//        UPMA(30),
//        DOSA(40);
//
//        private final int price;
//
//        // Constructor - must be private or package-private
//        items(int price) {
//            this.price = price;
//        }
//        public int getPrice() {
//            return price;
//        }
//    }

    Scanner sc=new Scanner(System.in);
    double totalbill=0;
    int items;
    boolean flag=true;

    public void order(int price){
        totalbill=totalbill+price;
    }

    public double generateBill(){
        return this.totalbill;
    }

    public void selectOrder(){

        do{
            System.out.println("1.Poha\t20\n" +
                    "2.Upma\t30\n" +
                    "3.Dosa\t40\n" +
                    "4.Confirm Order\n" +
                    "5.Cancel Order...go back\n");
            items= sc.nextInt();
            flag=true;
            switch(items){
                case 1:
                    order(20);
                    break;
                case 2:
                    order(30);
                    break;
                case 3:
                    order(40);
                    break;
                case 4:
                    System.out.println("Order Confirmed Successfully!!!!");
                    flag=false;
                    break;
                case 5:
                    cancelOrder();
                    flag=true;
                    break;
                default:
                    System.out.println("select list items from menu");
            }
        }while(flag);
    }
    public void cancelOrder(){
        this.totalbill=0;
    }
}
