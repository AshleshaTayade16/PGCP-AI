package stack;

public class ModifiedFact {
    public static void main(String []args){
        int fact=1;
        int num=1;
        while(num!=0) {
            fact=1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            if(fact<=1000) {
                System.out.println("Factorial of " + num + " is " + fact);
                num++;
            }
            else{
                break;
            }
        }
    }
}
