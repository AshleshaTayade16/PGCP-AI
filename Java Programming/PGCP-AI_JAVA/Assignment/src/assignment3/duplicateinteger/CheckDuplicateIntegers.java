package assignment3.duplicateinteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.exit;

public class CheckDuplicateIntegers {
    Scanner sc=new Scanner(System.in);
    List<DuplicateIntegers> integerList=new ArrayList<>();

    public void addIntegers(){
        int choice;
        try{
            do {
                System.out.println("1.Add the Integer\n" +
                        "0.Exit");
                System.out.println("Enter the choice: ");
                choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the Integer: ");
                        int num = sc.nextInt();
                        boolean found = false;

                        for (DuplicateIntegers item : integerList) {
                            if (item.getInteger() == num) {
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            throw new DuplicateIntegerException();
                        } else
                        {
                            integerList.add(new DuplicateIntegers(num));
                            System.out.println("List: " + integerList);
                        }
                        break;
                    case 0:
                        System.out.println("Exited Successfully");
                        exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input");
                }

            } while (choice != 0);
        }
        catch (DuplicateIntegerException e){
            System.out.println(e.getMessage());
        }

    }
}
