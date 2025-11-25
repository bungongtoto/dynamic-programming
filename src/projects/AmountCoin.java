package projects;

import java.util.ArrayList;

public class AmountCoin {

    public  static  int minChange(int[] coins, int amount){

        return dfs(coins, amount, 0, new Integer[coins.length][amount + 1]);
    }

    private static int dfs(int[] coins, int amount, int startIndex, Integer[][] memo){
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (memo[startIndex][amount] != null) return memo[startIndex][amount];

        int minCoins = -1;
        for (int i = startIndex; i < coins.length ; i++){
            int count = dfs(coins, amount - coins[i], i, memo);
            if (count >= 0){
                count++;
                if (count < minCoins || minCoins == -1){
                    minCoins = count;
                    memo[startIndex][amount - coins[i]] = minCoins;
                }
            }
        }
        return  minCoins;
    }
}
