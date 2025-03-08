package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 2), 4);
	}
	
	@Test
	public void testMultiplyNegative() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(3, -3), 9);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(8, 2), 4);
	}
	
	@Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
        int result = calc.divide(10, 0);
    }
}
