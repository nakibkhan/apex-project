package services;

import model.Product;
import util.ProductIndexCalculator;

import java.util.List;
public class VendingMachine {
    List<Product> products;

    int productIndex = 0;

    public VendingMachine(List<Product> products)   {
        this.products = products;
    }

    boolean on;

    public void powerButton() {
        on = !on;
        printStatus();
    }

    public boolean isOn() {
        return on;
    }

    public boolean isSoldOut()  {
        return on && products.stream().noneMatch(Product::isAvailable);
    }

    public void pushUp()    {
        productIndex = ProductIndexCalculator.determineIndexUp(productIndex, products.size());
        printStatus();
    }

    public void pushDown()    {
        productIndex = ProductIndexCalculator.determineIndexDown(productIndex, products.size());
        printStatus();
    }

    public void buy() {
        products.get(productIndex).sellProduct();
        printStatus();
    }

    public String status() {
        if(this.isSoldOut())    {
            return "-------------------- SOLD OUT -----------------------";
        }

        if(!this.isOn()) {
            return "-------------------- TURNED OFF ---------------------";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Name : ")
                .append(products.get(productIndex).getName())
                .append(", ")
                .append("Price ").append(products.get(productIndex).getPrice())
                .append(", ")
                .append("Amount Available : ").append(products.get(productIndex).getCount());

        return sb.toString();
    }

    public void printStatus()   {
        System.out.println(this.status());
    }
}
