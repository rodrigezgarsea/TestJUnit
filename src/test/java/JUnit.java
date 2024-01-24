
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit {

    private TesterJUnit calculator;

    @Test
    public void testAddition() {
        TesterJUnit calculator = new TesterJUnit();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        TesterJUnit calculator = new TesterJUnit();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        TesterJUnit calculator = new TesterJUnit();
        int result = calculator.multiply(6, 3);
        assertEquals(18, result);
    }

    @Test
    public void testDivision() {
        TesterJUnit calculator = new TesterJUnit();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        TesterJUnit calculator = new TesterJUnit();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}