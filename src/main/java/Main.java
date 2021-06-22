import model.Product;
import services.VendingMachine;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] args) {

        Product product1 = new Product("Sneakers", 1, 2.00);
        Product product2 = new Product("Twix", 1, 2.20);

        List<Product> productList = Arrays.asList(product1, product2);

        VendingMachine vendingMachine = new VendingMachine(productList);

        vendingMachine.powerButton();
        vendingMachine.pushDown();
        vendingMachine.pushDown();

        vendingMachine.buy();

        vendingMachine.pushUp();

        vendingMachine.buy();
    }
}
