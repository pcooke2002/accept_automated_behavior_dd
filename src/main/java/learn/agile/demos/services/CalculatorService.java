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
}
