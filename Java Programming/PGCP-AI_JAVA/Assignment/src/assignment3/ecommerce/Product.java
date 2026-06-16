package assignment3.ecommerce;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\t" + this.price + "\t" + this.quantity;
    }
}