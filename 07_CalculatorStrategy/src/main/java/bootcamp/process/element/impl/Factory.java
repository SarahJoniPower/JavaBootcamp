package bootcamp.process.element.impl;

import bootcamp.process.element.ElementFactory;
import bootcamp.process.element.ProcessingElement;

import java.util.Optional;

public class Factory implements ElementFactory {

    @Override
    public Optional<ProcessingElement> create(final String operator) {

        if (operator.equals("+")) {
            return Optional.of(new Adder());
        } else if (operator.equals("-")) {
            return Optional.of(new Subtractor());
        } else if (operator.equals("/")) {
            return Optional.of(new Divider());
        } else if (operator.equals("*")) {
            return Optional.of(new Multiplier());
        }
        return Optional.empty();
    }
}
