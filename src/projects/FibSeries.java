package projects;

import java.util.HashMap;

public class FibSeries {

    public  static int fib(int n){
        return fib(n, new HashMap<>());
    }

    public static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n <= 1) return n;

        if (memo.containsKey(n)){
            return memo.get(n);
        }
        int  results =  fib(n - 1) + fib(n - 2);
        memo.put(n, results);
        return  results;
    }
}
