import org.junit.jupiter.api.Test;
import ua.goit.ExponentCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class ExponentCalculatorTest {

    @Test
    public void testCalculateEUsingTaylorSeries() {
        double e = ExponentCalculator.calculateEUsingTaylorSeries(10);
        assertEquals(Math.E, e, 0.01, "Taylor series calculation is incorrect");
    }

    @Test
    public void testCalculateEUsingLimit() {
        double e = ExponentCalculator.calculateEUsingLimit(100000);
        assertEquals(Math.E, e, 0.01, "Limit calculation is incorrect");
    }

    @Test
    public void testInvalidInputTaylorSeries() {
        assertThrows(IllegalArgumentException.class, () -> ExponentCalculator.calculateEUsingTaylorSeries(0));
    }

    @Test
    public void testInvalidInputLimit() {
        assertThrows(IllegalArgumentException.class, () -> ExponentCalculator.calculateEUsingLimit(-1));
    }
}
