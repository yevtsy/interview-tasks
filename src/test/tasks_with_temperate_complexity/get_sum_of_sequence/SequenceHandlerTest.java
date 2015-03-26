package tasks_with_temperate_complexity.get_sum_of_sequence;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SequenceHandlerTest {
    private SequenceHandler sequenceHandler;

    @BeforeClass
    public void setUp() throws Exception {
        sequenceHandler = new SequenceHandler();
    }

    @Test
    public void testEmptySequence() throws Exception {
        int[] seq = {};
        assertEquals(sequenceHandler.findMaxSubSequenceValue(seq), 0);
    }

    @Test
    public void testOneElementSequence() throws Exception {
        int[] seq = {1};
        assertEquals(sequenceHandler.findMaxSubSequenceValue(seq), 1);
    }

    @Test
    public void testShortPositiveSequence() throws Exception {
        int[] seq = {1, 2, 3, -2};
        assertEquals(sequenceHandler.findMaxSubSequenceValue(seq), 6);
    }
}