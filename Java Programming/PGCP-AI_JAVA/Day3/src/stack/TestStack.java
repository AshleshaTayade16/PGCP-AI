package stack;
import java.util.Scanner;
import static java.lang.System.exit;

public class TestStack {

    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num=sc.nextInt();

        StackOperationsFunctionalities stack=new StackOperationsFunctionalities(num);

        do{
            System.out.print("\n");
            System.out.println("1.Push Operation");
            System.out.println("2.Pop Operation");
            System.out.println("3.Peek Operation");
            System.out.println("4.Print Stack Data");
            System.out.println("0.Exit");
            System.out.print("Enter the choice: ");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element: ");
                    num= sc.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 0:
                    System.out.println("Successfully Exited!!!");
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid input.....");
            }
        }while(stack!=null);

    }
}
