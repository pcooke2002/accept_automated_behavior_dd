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
	 * @param x
	 * @param y
	 * @return the result of multiplication
	 */
	public int multiply(final int x, final int y) {
		return x * y;
	}

}
