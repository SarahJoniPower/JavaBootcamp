package bootcamp.process;

import bootcamp.data.Params;
import bootcamp.process.calculator.Calculator;
import bootcamp.process.element.impl.Factory;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {
    @Test
    public void divideByZero() {
        var x = new BigDecimal(2);
        var y = new BigDecimal(0);
        var operator = "/";

        Params params = new Params(x, y, operator);

        Calculator calculator = new Calculator(new Factory());

        var result = calculator.calculate(params);

//        assertEquals(new BigDecimal(), result.getValue());

        System.out.println(result.getStatus());
        System.out.println(result.getStatusMessage());
        System.out.println(result.getValue());
    }
}
