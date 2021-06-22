import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import services.VendingMachine;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VendingMachineTest {

    VendingMachine vm;
    Product product1;
    Product product2;
    Product product3;

    @BeforeEach
    public void setUp() {
        product1 = new Product("Sneakers", 2, 2.00);
        product2 = new Product("Twix", 3, 2.20);
        product3 = new Product("Mars", 4, 3.20);

        List<Product> prductList = Arrays.asList(product1, product2, product3);

        vm = new VendingMachine(prductList);
    }

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        assertFalse(vm.isOn());

        vm.powerButton();

        assertTrue(vm.isOn());

        vm.powerButton();

        assertFalse(vm.isOn());
    }

    @Nested
    class SoldOut {

        @BeforeEach
        public void setUp() {
            product1 = new Product("Sneakers", 0, 2.00);
            product2 = new Product("Twix", 0, 2.20);
            product3 = new Product("Mars", 0, 3.20);

            List<Product> prductList = Arrays.asList(product1, product2, product3);

            vm = new VendingMachine(prductList);
        }

        @Test
        public void vmShouldShowSoldOutWhenOn() {
            assertFalse(vm.isOn());

            vm.powerButton();
            System.out.println("Test");

            assertTrue(vm.isSoldOut());
        }


    }


}