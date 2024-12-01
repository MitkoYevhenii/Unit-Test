package ua.goit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PiCalculatorTest {

    @Test
    public void testCalculatePiUsingLeibnizSeries() {
        double pi = PiCalculator.calculatePiUsingLeibnizSeries(100000);
        assertEquals(Math.PI, pi, 0.001, "Leibniz series calculation is incorrect");
    }

    @Test
    public void testCalculatePiUsingMonteCarlo() {
        double pi = PiCalculator.calculatePiUsingMonteCarlo(1000000);
        assertEquals(Math.PI, pi, 0.01, "Monte Carlo calculation is incorrect");
    }

    @Test
    public void testInvalidInputLeibnizSeries() {
        assertThrows(IllegalArgumentException.class, () -> PiCalculator.calculatePiUsingLeibnizSeries(0));
    }

    @Test
    public void testInvalidInputMonteCarlo() {
        assertThrows(IllegalArgumentException.class, () -> PiCalculator.calculatePiUsingMonteCarlo(-1));
    }
}
