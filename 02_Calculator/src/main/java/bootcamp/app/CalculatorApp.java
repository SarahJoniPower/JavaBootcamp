package bootcamp.app;

import java.math.BigDecimal;
import bootcamp.data.Params;
import bootcamp.calculator.Calculator;

/**
 * TODO: The application should be able to handle 3 arguments (first number, second number, operation).
 * The application should write the results to the standard output.
 */
public class CalculatorApp {
    public static void main(final String[] args) {

        final BigDecimal x = new BigDecimal(args[0]);
        final BigDecimal y = new BigDecimal(args[1]);
        final String operator = args[2];

        Params params = new Params(x,y,operator);

        Calculator calculator = new Calculator();

        BigDecimal result = calculator.calculate(params);

        System.out.println(result);
    }
}
