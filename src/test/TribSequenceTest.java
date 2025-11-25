package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import projects.TribSequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TribSequenceTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "2, 1"
    })
    public void testBaseCase(int n, int expected){
        int results = TribSequence.tribonacci(n);
        assertEquals(expected, results);
    }
    
    @ParameterizedTest
    @CsvSource({
            "3, 1",
            "4, 2",
            "5, 4",
            "6, 7",
            "7, 13"
    })
    public void testRecursiveCases(int n, int expected){
        assertEquals(expected, TribSequence.tribonacci(n));
    }
    
    @Test
    public void testLargerNumbers(){
        assertEquals(24, TribSequence.tribonacci(8));
        assertEquals(44, TribSequence.tribonacci(9));
        assertEquals(81, TribSequence.tribonacci(10));
    }
    
    @Test
    public void testNegativeInput(){
        assertEquals(0, TribSequence.tribonacci(-1));
        assertEquals(0, TribSequence.tribonacci(-5));
    }
}
