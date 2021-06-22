package model;

public class Product {
    String name;
    int count = 0;
    double price = 0.00;

    public Product(String name, int count, double price)    {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void sellProduct()    {
        count--;
    }

    public boolean isAvailable()  {
        return this.count != 0;
    }
}
