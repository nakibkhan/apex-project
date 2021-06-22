package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductIndexCalculatorTest {

    @Test
    void determineIndexUp_normal() {
        Assertions.assertEquals(2, ProductIndexCalculator.determineIndexUp(1, 3));
    }

    @Test
    void determineIndexUp_beyond_size() {
        Assertions.assertEquals(0, ProductIndexCalculator.determineIndexUp(2, 3));
    }

    @Test
    void determineIndexDown_normal() {
        Assertions.assertEquals(0, ProductIndexCalculator.determineIndexDown(1, 3));
    }

    @Test
    void determineIndexDown_beyond_size() {
        Assertions.assertEquals(4, ProductIndexCalculator.determineIndexDown(0, 5));
    }
    @Test
    void determineIndexDown_beyond_size_2() {
        Assertions.assertEquals(2, ProductIndexCalculator.determineIndexDown(0, 3));
    }
}