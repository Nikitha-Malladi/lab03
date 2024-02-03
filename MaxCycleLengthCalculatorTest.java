import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxCycleLengthCalculatorTest {

    @Test
    public void testSampleInput1() {
        assertEquals("1 10 20", getMaxCycleLengthOutput(1, 10));
    }

    @Test
    public void testSampleInput2() {
        assertEquals("100 200 125", getMaxCycleLengthOutput(100, 200));
    }

    @Test
    public void testSampleInput3() {
        assertEquals("201 210 89", getMaxCycleLengthOutput(201, 210));
    }

    @Test
    public void testSampleInput4() {
        assertEquals("900 1000 174", getMaxCycleLengthOutput(900, 1000));
    }

    // Helper method to get the expected output string
    private String getMaxCycleLengthOutput(int i, int j) {
        return a + " " + b + " " + MaxCycleLengthCalculator.calculateMaxCycleLength(a, b);
    }
}
