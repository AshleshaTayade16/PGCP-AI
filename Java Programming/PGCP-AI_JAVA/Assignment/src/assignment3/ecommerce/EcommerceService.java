package assignment3.ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class EcommerceService {
    Scanner sc = new Scanner(System.in);
    private Map<Integer, Product> inventory = new HashMap<>();
    private int totalItemsSold = 0;

    public void addProduct(Product p) {
        inventory.put(p.getId(), p);
    }

    public Product getProduct(int id) {
        return inventory.get(id);
    }

    public void showInventory() {
        System.out.println("\n--- Store Inventory ---");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public void checkout(User user) throws InventoryException, PaymentException {

        if(user.getCart().isEmpty()) {
            throw new InventoryException("Checkout failed: Your cart is empty");
        }

        double totalAmount = 0;

        for (Product cartItem : user.getCart()) {
            Product stockItem = inventory.get(cartItem.getId());
            if (stockItem == null) {
                throw new InventoryException("Product no longer exists");
            }

            if (stockItem.getQuantity() < cartItem.getQuantity()) {
                throw new InventoryException("Out of Stock: "+
                        " (Available: " + stockItem.getQuantity() + ")");
            }
            totalAmount += cartItem.getPrice() * cartItem.getQuantity();
        }

        for (Product cartItem : user.getCart()) {
            Product stockItem = inventory.get(cartItem.getId());
            stockItem.setQuantity(stockItem.getQuantity() - cartItem.getQuantity());
            totalItemsSold += cartItem.getQuantity();
        }

        System.out.println("Success! Order placed....Total Amount Rs." + totalAmount);
        user.clearCart();
    }

    public void showStats() {
        System.out.println("\n--- Business Statistics ---");
        System.out.println("Total units sold: " + totalItemsSold);
    }

    public void menu(){

        addProduct(new Product(1, "Laptop", 55000, 5));
        addProduct(new Product(2, "Phone", 20000, 10));
        addProduct(new Product(3, "Speaker", 3000, 15));

        System.out.println("--------------Welcome To E-Commerce Website------------");
        System.out.print("Enter Your Name: ");
        User user = new User(sc.nextLine());

        int choice;
        do{
            System.out.println("\n--- E-COMMERCE MENU ---");
            System.out.println("1.View Products\n" +
                    "2.Add to Cart\n" +
                    "3.Remove Product\n" +
                    "4.View Cart\n" +
                    "5.Checkout\n" +
                    "0.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        showInventory();
                        break;
                    case 2:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        Product p = getProduct(id);
                        if (p != null) {
                            System.out.print("Enter Quantity: ");
                            user.addToCart(p, sc.nextInt());
                        }
                        else{
                            throw new InventoryException("Product Not Found!!!!!!!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter ID to remove product: ");
                        user.removeFromCart(sc.nextInt());
                        break;
                    case 4:
                        user.viewCart();
                        break;
                    case 5:
                        checkout(user);
                        break;
                    case 0:
                        showStats();
                        exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!!!!!!!");
                }
            } catch(InventoryException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (PaymentException e) {
                System.out.println("Payment Error: "+e.getMessage());
            } catch (Exception e) {
                System.out.println("System Error: " + e.getMessage());
            }
        }while(choice!=0);
    }
}