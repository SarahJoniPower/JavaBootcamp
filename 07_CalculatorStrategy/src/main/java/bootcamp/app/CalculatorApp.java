package bootcamp.app;

import bootcamp.data.Params;
import bootcamp.process.calculator.Calculator;
import bootcamp.process.element.ElementFactory;
import bootcamp.process.element.impl.Factory;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalculatorApp {
    public static void main (String [] args) {

        var x = new BigDecimal(2);
        var y = new BigDecimal(0);
        var operator = "/";

        Params params = new Params(x, y, operator);

        Calculator calculator = new Calculator(new Factory());

        var result = calculator.calculate(params);

        System.out.println(result.getStatus());
        System.out.println(result.getStatusMessage());
        System.out.println(result.getValue());
    }
}
