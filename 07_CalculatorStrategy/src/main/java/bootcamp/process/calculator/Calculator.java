package bootcamp.process.calculator;

import bootcamp.data.Params;
import bootcamp.data.Result;
import bootcamp.data.Status;
import bootcamp.process.element.ElementFactory;

import java.util.Optional;


public class Calculator {
    private ElementFactory factory;

    public Calculator(ElementFactory elementFactory) {
        this.factory = elementFactory;
    }

    public Result calculate(final Params params) {
        var element = factory.create(params.getOperator());

        if (element.isEmpty()) {
            return new Result(Status.InvalidOperation, "There was a problemo", Optional.empty());
        }

        return new Result(Status.Success, "A result!", Optional.of(element.get().process(params.getX(), params.getY())));

        //FIXME using the factory and implementations of ProcessingElement
    }
}
