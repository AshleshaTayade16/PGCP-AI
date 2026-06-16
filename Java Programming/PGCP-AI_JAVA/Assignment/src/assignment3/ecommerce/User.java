package assignment3.ecommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private String name;
    private List<Product> cart;

    public User(String name){
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product p, int qty){
        cart.add(new Product(p.getId(), p.getName(), p.getPrice(), qty));
        System.out.println("Added " + qty + " units of " + p.getName() + " to cart");
    }

    public void removeFromCart(int id) throws InventoryException {
        Iterator<Product> iterator = cart.iterator();
        boolean found = false;
        while(iterator.hasNext()) {
            if(iterator.next().getId() == id) {
                iterator.remove();
                found = true;
                System.out.println("Product removed from cart");
                break;
            }
        }
        if (!found) {
            throw new InventoryException("Product not found");
        }
    }

    public void viewCart() throws InventoryException {
        System.out.println("\n--- Shopping Cart ---");
        if (cart.isEmpty()) {
            throw new InventoryException("Cart is empty");
        }
        else {
            for (Product p : cart) {
                System.out.println(p.getName() + " (Qty: " + p.getQuantity() + ")");
            }
        }
    }

    public List<Product> getCart() {
        return this.cart;
    }

    public void clearCart() {
        this.cart.clear();
    }

    public String getName() {
        return this.name;
    }
}