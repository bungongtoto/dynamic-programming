package projects;

import java.util.HashMap;

public class TribSequence {
    public static int tribonacci(int n){
        return  tribonacci(n, new HashMap<>());
    }

    public  static  int tribonacci(int n , HashMap<Integer, Integer> memo){

        if (n <= 0 || n == 1){
            return  0;
        }

        if (n == 2) return 1;

        if (memo.containsKey(n))  return  memo.get(n);

        int results = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci( n - 3);

        memo.put(n , results);

        return results;
    }
}
