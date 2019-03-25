package learn.agile.demos.services;

import org.springframework.stereotype.Service;

/**
 * @author pcooke
 *
 */
@Service
public class CalculatorService {
	int notUsedVariableForScanBugs;

	/**
	 * add 2 numbers
	 * 
	 * @param x
	 * @param y
	 * @return the result of the addition
	 */
	public float add(final float x, final float y) {
		return x + y;
	}

	/**
	 * subtract 2 numbers
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of subtraction
	 */
	public float subtract(final float x, final float y) {
		return x - y;
	}

	/**
	 * multiply 2 numbers
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of multiplication
	 */
	public float multiply(final float x, final float y) {
		return x * y;
	}

	/**
	 * multiply 2 numbers
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of multiplication
	 */
	public float divide(final float firstNumber, final float secondNumber) {
		return firstNumber / secondNumber;
	}
}
