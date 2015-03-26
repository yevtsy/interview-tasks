package tasks_with_temperate_complexity.search_max_value;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxValueSearcherTest {
    private MaxValueSearcher maxValueSearcher;

    @BeforeClass
    public void setUp() throws Exception {
        maxValueSearcher = new MaxValueSearcher();
    }

    @Test
    public void testMaxPositiveValues() {
        int a = 1, b = 10;
        assertEquals(maxValueSearcher.getMax(a, b), Math.max(a, b));
    }

    @Test
    public void testMaxNegativeValues() {
        int a = -1, b = -10;
        assertEquals(maxValueSearcher.getMax(a, b), Math.max(a, b));
    }

    @Test
    public void testMaxDiffSignsValues() {
        int a = 1, b = -10;
        assertEquals(maxValueSearcher.getMax(a, b), Math.max(a, b));
    }
}