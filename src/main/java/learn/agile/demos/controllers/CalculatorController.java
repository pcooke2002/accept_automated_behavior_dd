package learn.agile.demos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.agile.demos.services.CalculatorService;

/**
 * @author pcooke
 *
 */
@RestController
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	/**
	 * @param firstNumber
	 * @param secondNumber
	 * @return int
	 */
	@RequestMapping("/multiplyer")
	public int multiplyer(
			@RequestParam(value = "firstNumber", defaultValue = "0") int firstNumber,
			@RequestParam(value = "secondNumber", defaultValue = "0") int secondNumber) {
		return calculatorService.multiply(firstNumber, secondNumber);
	}

}
