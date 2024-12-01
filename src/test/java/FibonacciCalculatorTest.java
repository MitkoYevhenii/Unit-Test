package ua.goit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciCalculatorTest {

    @Test
    public void testCalculateFibonacciRecursive() {
        assertEquals(0, FibonacciCalculator.calculateFibonacciRecursive(0));
        assertEquals(1, FibonacciCalculator.calculateFibonacciRecursive(1));
        assertEquals(55, FibonacciCalculator.calculateFibonacciRecursive(10));
    }

    @Test
    public void testCalculateFibonacciIterative() {
        assertEquals(0, FibonacciCalculator.calculateFibonacciIterative(0));
        assertEquals(1, FibonacciCalculator.calculateFibonacciIterative(1));
        assertEquals(55, FibonacciCalculator.calculateFibonacciIterative(10));
    }

    @Test
    public void testCalculateFibonacciUsingBinet() {
        assertEquals(0, FibonacciCalculator.calculateFibonacciUsingBinet(0));
        assertEquals(1, FibonacciCalculator.calculateFibonacciUsingBinet(1));
        assertEquals(55, FibonacciCalculator.calculateFibonacciUsingBinet(10));
    }

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciCalculator.calculateFibonacciRecursive(-1));
        assertThrows(IllegalArgumentException.class, () -> FibonacciCalculator.calculateFibonacciIterative(-1));
        assertThrows(IllegalArgumentException.class, () -> FibonacciCalculator.calculateFibonacciUsingBinet(-1));
    }
}
