package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.add(-1, -1), -2);
	}	
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(4, 2), 2);
		assertEquals(calc.minus(2, 4), -2);
	}	
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(4, 2), 8);
		assertEquals(calc.multiply(4, -2), -8);
		assertEquals(calc.multiply(-4, -2), 8);
		assertEquals(calc.multiply(4, 0), 0);
	}	
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 2), 2);
		assertEquals(calc.divide(-4, 2), -2);
		assertEquals(calc.divide(-4, -2), 2);
	}	
	

	@Test
	public void testDivideZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 0), 0);
	}	

}
