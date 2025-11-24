package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import projects.FibSeries;

public class FibSeriesTest {
    
    @Test
    public void testBaseCases() {
        assertEquals(0, FibSeries.fib(0));
        assertEquals(1, FibSeries.fib(1));
    }
    
    @Test
    public void testRecursiveCase() {
        assertEquals(5, FibSeries.fib(5));
        assertEquals(8, FibSeries.fib(6));
    }
    
    @Test
    public void testSmallNumbers() {
        assertEquals(1, FibSeries.fib(2));
        assertEquals(2, FibSeries.fib(3));
        assertEquals(3, FibSeries.fib(4));
    }
    
    @Test
    public void testLargerNumbers() {
        assertEquals(13, FibSeries.fib(7));
        assertEquals(21, FibSeries.fib(8));
        assertEquals(55, FibSeries.fib(10));
    }
    
    @Test
    public void testNegativeInput() {
        assertEquals(-1, FibSeries.fib(-1));
        assertEquals(-2, FibSeries.fib(-2));
    }
}
