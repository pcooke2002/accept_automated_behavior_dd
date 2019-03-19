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
	 * @param x
	 * @param y 
	 * @return the result of subtraction
	 */
	public int subtract(int x, int y) {
		return x - y;
	}

}
