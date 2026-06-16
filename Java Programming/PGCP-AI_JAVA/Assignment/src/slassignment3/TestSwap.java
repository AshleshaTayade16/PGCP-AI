package slassignment3;

public class TestSwap {
    public static void main(String[] args) {

        Swapping sw=new Swapping(10,20);
        System.out.println("Before Swapping: a="+sw.num1+"  b="+sw.num2);
        sw.swapWithThird();
        System.out.println("After Swapping: a="+sw.num1+"  b="+sw.num2);

    }
}
