package travis_ci_tutorial_java;

public class SimpleCalculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	// minus operation
	public int minus(int a, int b) {
		return a - b;
	}
	
	// multiply operation
	public int multiply(int a, int b) {
		return a * b;
	}
	
	// divide operation
	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("denominator cannot be 0");
		} else return a / b;
	}
	
}
