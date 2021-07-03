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
        fail("Not Implemented");
    }

    @Test
    public void shouldReturnValueAtGivenArrayIndex() {
        fail("Not Implemented");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldGetExceptionFromGetValueWhenIndexTooLarge() {
        fail("Not Implemented");
    }
}
