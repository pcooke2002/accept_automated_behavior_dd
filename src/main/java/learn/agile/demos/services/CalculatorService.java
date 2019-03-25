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
	 * @param firstNumber
	 * @param secondNumber
	 * @return the result of multiplication
	 */
	public float multiply(final float firstNumber, final float secondNumber) {
		return firstNumber * secondNumber;
	}
}
