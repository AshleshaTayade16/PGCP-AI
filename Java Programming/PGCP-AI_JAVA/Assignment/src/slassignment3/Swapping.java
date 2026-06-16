package slassignment3;

public class Swapping {
    int num1, num2;

    public Swapping(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void swapWithThird(){
        int temp=this.num1;
        this.num1=this.num2;
        this.num2=temp;
    }
}
