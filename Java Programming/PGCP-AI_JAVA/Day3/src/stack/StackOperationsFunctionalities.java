package stack;

import java.util.Arrays;

public class StackOperationsFunctionalities implements IStack{

    int top=-1;
    int num;
    int[] arr;
    public StackOperationsFunctionalities(int num) {
         this.arr=new int[num];
    }
    void overflow(){
        System.out.println("Stack is Overflow \n can't push the element!!!");
    }
    void underflow(){
        System.out.println("Stack is Underflow");
    }

    @Override
    public void push(int value){
        if(top==this.arr.length-1){
            overflow();
        }
        else{
            top++;
            this.arr[top]=value;
            System.out.println("Pushed element: "+this.arr[top]);
        }
    }
    @Override
    public void pop(){
        if(top==-1){
            underflow();
        }
        else {
            System.out.println("Poped element: "+this.arr[top]);
            this.arr[top] = 0;
            top--;
        }
    }
    @Override
    public void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: "+this.arr[top]);

        }
    }
    @Override
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(Arrays.toString(arr));
        }
    }
}
