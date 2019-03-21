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
	 * subtract 2 numbers
	 * @param firstNumber
	 * @param secondNumber 
	 * @return the result of subtraction
	 */
	public float subtract(float firstNumber, float secondNumber) {
		return firstNumber - secondNumber;
	}
}
