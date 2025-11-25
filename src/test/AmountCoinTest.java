package test;

import org.junit.jupiter.api.Test;
import projects.AmountCoin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AmountCoinTest {
    
    @Test
    public void testBasicCases() {
        assertEquals(0, AmountCoin.minChange(new int[]{1, 2, 5}, 0));
        assertEquals(1, AmountCoin.minChange(new int[]{1, 2, 5}, 1));
        assertEquals(1, AmountCoin.minChange(new int[]{1, 2, 5}, 2));
        assertEquals(1, AmountCoin.minChange(new int[]{1, 2, 5}, 5));
    }
    
    @Test
    public void testMultipleCoins() {
        assertEquals(2, AmountCoin.minChange(new int[]{1, 2, 5}, 3)); // 2+1
        assertEquals(2, AmountCoin.minChange(new int[]{1, 2, 5}, 4)); // 2+2
        assertEquals(2, AmountCoin.minChange(new int[]{1, 2, 5}, 6)); // 5+1
        assertEquals(2, AmountCoin.minChange(new int[]{1, 2, 5}, 7)); // 5+2
    }
    
    @Test
    public void testOptimalSolution() {
        assertEquals(3, AmountCoin.minChange(new int[]{2, 3, 5}, 9)); // 3+3+3
        assertEquals(2, AmountCoin.minChange(new int[]{1, 4, 5}, 8)); // 4+4
    }
    
    @Test
    public void testSingleCoin() {
        assertEquals(1, AmountCoin.minChange(new int[]{5}, 5));
        assertEquals(2, AmountCoin.minChange(new int[]{5}, 10));
        assertEquals(3, AmountCoin.minChange(new int[]{3}, 9));
    }
    
    @Test
    public void testLargerAmounts() {
        assertEquals(3, AmountCoin.minChange(new int[]{1, 2, 5}, 11)); // 5+5+1
        assertEquals(3, AmountCoin.minChange(new int[]{1, 2, 5}, 12)); // 5+5+2
    }
    
    @Test
    public void testPerformance() {
        long start = System.nanoTime();
        AmountCoin.minChange(new int[]{1, 2, 5}, 15);
        long duration = System.nanoTime() - start;
        assertTrue(duration < 100_000_000, "Should complete within 100ms");
    }
}
