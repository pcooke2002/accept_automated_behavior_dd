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
	 * 
	 * @param x
	 * @param y
	 * @return the result of subtraction
	 */
	public int subtract(final int x, final int y) {
		return x - y;
	}

}
