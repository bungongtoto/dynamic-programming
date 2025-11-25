package test;

import org.junit.jupiter.api.Test;
import projects.SumPossible;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumPossibleTest {
    
    @Test
    public void testBasicCases() {
        assertEquals(1, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 0));
        assertEquals(1, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 1)); // [1]
        assertEquals(2, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 2)); // [2], [1,1]
    }
    
    @Test
    public void testMultipleCombinations() {
        assertEquals(3, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 3)); // [3], [1,2], [1,1,1]
        assertEquals(4, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 4)); // [1,3], [2,2], [1,1,2], [1,1,1,1]
        assertEquals(5, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 5)); // [2,3], [1,1,3], [1,2,2], [1,1,1,2], [1,1,1,1,1]
    }
    
    @Test
    public void testSingleElement() {
        assertEquals(1, SumPossible.amountSumPossible(new int[]{5}, 5)); // [5]
        assertEquals(1, SumPossible.amountSumPossible(new int[]{5}, 10)); // [5,5]
        assertEquals(0, SumPossible.amountSumPossible(new int[]{5}, 3)); // impossible
    }
    
    @Test
    public void testEmptyArray() {
        assertEquals(1, SumPossible.amountSumPossible(new int[]{}, 0));
        assertEquals(0, SumPossible.amountSumPossible(new int[]{}, 5));
    }
    
    @Test
    public void testLargerNumbers() {
        assertEquals(7, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 6)); // [3,3], [1,2,3], [2,2,2], [1,1,1,3], [1,1,2,2], [1,1,1,1,2], [1,1,1,1,1,1]
        assertEquals(8, SumPossible.amountSumPossible(new int[]{1, 2, 3}, 7)); // 8 combinations with repetition allowed
    }
    

}
