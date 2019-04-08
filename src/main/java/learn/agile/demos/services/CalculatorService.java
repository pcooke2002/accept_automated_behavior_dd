package learn.agile.demos.services;

import org.springframework.stereotype.Service;

/**
 * @author pcooke
 *
 */
@Service
public class CalculatorService {
    /**
     * Variable is not used for spot bugs to find.
     */
    final int  notUsedVariableForScanBugs = 0;

    /**
     * add 2 numbers.
     *
     * @param x first operator.
     * @param y second operator.
     * @return the result of the addition.
     */
    public final float add(final float x, final float y) {
        return x + y;
    }

    /**
     * subtract 2 numbers.
     *
     * @param x first operand.
     * @param y second operand.
     * @return the result of subtraction.
     */
    public final float subtract(final float x, final float y) {
        return x - y;
    }

    /**
     * multiply 2 numbers.
     *
     * @param x first operand.
     * @param y second operand.
     * @return the result of multiplication.
     */
    public final float multiply(final float x, final float y) {
        return x * y;
    }

    /**
     * multiply 2 numbers.
     *
     * @param x first operand.
     * @param y second operand.
     * @return the result of multiplication.
     */
    public final float divide(final float x, final float y) {
        return x / y;
    }
}
