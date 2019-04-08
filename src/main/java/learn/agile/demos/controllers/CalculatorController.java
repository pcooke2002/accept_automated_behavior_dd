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

    /**
     * Reference to the Calculator service.
     */
    @Autowired
    private  CalculatorService calculatorService;

    /**
     * Add two numbers.
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     * @return float result of Add..
     */
    @RequestMapping("/adder")
    public final float adder(
            @RequestParam(value = "firstNumber", defaultValue = "0") final float firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0") final float secondNumber) {
        return calculatorService.add(firstNumber, secondNumber);
    }

    /**
     * Subtract two numbers.
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     * @return float result of subtract.
     */
    @RequestMapping("/subtracter")
    public final float subtracter(
            @RequestParam(value = "firstNumber", defaultValue = "0") final float firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0") final float secondNumber) {
        return calculatorService.subtract(firstNumber, secondNumber);
    }

    /**
     * Multiply two numbers.
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     *  @return float result of Multiply.
     */
    @RequestMapping("/multiplyer")
    public final float multiplyer(
            @RequestParam(value = "firstNumber", defaultValue = "0") final float firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0") final float secondNumber) {
        return calculatorService.multiply(firstNumber, secondNumber);
    }

    /**
     * @param firstNumber First Operand.
     * @param secondNumber Second Operand.
     * @return float result of Divide.
     */
    @RequestMapping("/divider")
    public final float divider(
            @RequestParam(value = "firstNumber", defaultValue = "0") final float firstNumber,
            @RequestParam(value = "secondNumber", defaultValue = "0") final float secondNumber) {
        return calculatorService.divide(firstNumber, secondNumber);
    }
}
