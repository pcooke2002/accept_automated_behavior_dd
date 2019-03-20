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
	public int add(int x, int y) {
		return x + y;
	}

	/**
	 * subtract 2 numbers
	 * 
	 * @param x
	 * @param y
	 * @return the result of subtraction
	 */
	public int subtract(int x, int y) {
		return x - y;
	}

	/** multiply 2 numbers
	 * @param x
	 * @param y
	 * @return the result of multiplication
	 */
	public int multiply(int x, int y) {
		return x * y;
	}
}
