package services;

import model.Product;

import java.util.List;
public class VendingMachine {
    List<Product> products;

    public VendingMachine(List<Product> products)   {
        this.products = products;
    }

    boolean on;

    public void powerButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public boolean isSoldOut()  {
        return on && products.stream().noneMatch(Product::isAvailable);
    }

    public String printStatus() {
        if(this.isSoldOut())    {
            return "-------------------- SOLD OUT -----------------------";
        }

        if(!this.isOn()) {
            return "-------------------- TURNED OFF ---------------------";
        }

        StringBuilder sb = new StringBuilder();
        for(Product product: products)  {
            sb.append("Name : " + product.getName() + ", Price " + product.getPrice() + ", Amount Available : " + product.getCount());
            sb.append("\n");
        }

        return sb.toString();
    }

}
