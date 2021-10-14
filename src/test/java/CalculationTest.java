import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    Calculation calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculation();
    }
    //Test 1
    @Test
    void testAdd() {
        assertEquals(12, calculator.add(8, 4));
    }
    //Test 2
    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(10, 8));
    }
    //Test 3
    @Test
    void testMultiply() {
        assertEquals(42, calculator.multiply(7, 6));
    }
    //Test 4
    @Test
    void testDivide() {
        assertEquals(5,calculator.divide(30, 6));

    }
    //Test 5
    @Test
    void testMode() {
        assertEquals(2, calculator.mode(11, 3));
    }
}