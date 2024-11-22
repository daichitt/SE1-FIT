package Tutorial12.src.test.java;
import Tutorial12.src.main.java.ArrayCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayCalculatorTest {

    @Test
    public void testArraySum() throws Exception {
        ArrayCalculator calculator = new ArrayCalculator();
        assertEquals(6, calculator.arraySum(new int[]{1, 2, 3}));
    }

    @Test
    public void testArrayIsNull() {
        ArrayCalculator calculator = new ArrayCalculator();
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.arraySum(null);
        });
        assertEquals("Array is null", exception.getMessage());
    }
}