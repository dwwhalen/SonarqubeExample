import com.example.sonar.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    public void addStringTest() {
        assertEquals(4, calculator.add("3", "1"));
    }

//    @Test
//    public void addStringInvalidTest() {
//        assertEquals(4, calculator.add("dennis", "1"));
//    }

    @Test
    public void addNestedTest() {
        assertEquals(7, calculator.add(calculator.add(3, 1), calculator.add(7, -4)));
    }

    @Test
    public void subtractTest() {
        assertEquals(2, calculator.subtract(3, 1));
    }

    @Test
    public void divideTest() {
        assertEquals(2, calculator.divide(6, 3), 0.0);
    }

    @Test
    public void divideDecimalTest() {
        assertEquals(0.5, calculator.divide(3, 6), 0.0);
    }
}
