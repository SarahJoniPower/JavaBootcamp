package bootcamp.process;

import bootcamp.data.Processor;
import bootcamp.data.Summary;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProcessorTest {
    @Test
    public void shouldGetSummaryWithCorrectValuesWhenProcessingValidArray() {
        double[] array = {2,10,45,3};
        Processor processor = new Processor(array);
        Summary summary = new Summary(2.0,45.0,60.0,4.0,15.0);
        assertEquals(summary, processor.process());
    }

    @Test
    public void shouldGetDefaultSummaryWhenProcessingEmptyArray() {
        double[] array = {};
        Processor processor = new Processor(array);
        Summary summary = new Summary(Double.NaN, Double.NaN, 0.0,0.0, Double.NaN);
        assertEquals(summary, processor.process());
    }

    @Test
    public void shouldReturnValueAtGivenArrayIndex() {
        double[] array = {2,4,6,9};
        Processor processor = new Processor(array);
        assertEquals(2, processor.getValue(0), 0.0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldGetExceptionFromGetValueWhenIndexTooLarge() {
        double[] array = {2,4,6,9};
        Processor processor = new Processor(array);
        assertEquals(2, processor.getValue(7), 0.0);
    }
}
