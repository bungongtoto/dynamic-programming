package projects;

public class SumPossible {
    /**
     *  Takes a List of nums and target and returns the number ways to sum to target using the numbers
     *  with numbers in mum Array used unlimited
     *  and order doesn't matter
     * @param nums {Integer}
     * @param target {Integer}
     * @return {Integer}
     */
    public  static int amountSumPossible(int[] nums, int target){
        if (nums.length == 0 && target == 0 ) return  1;
        if (nums.length == 0 && target > 0 ) return  0;
        Integer [][] memo = new Integer[nums.length][target + 1];
         return dfs(nums, target, 0, memo);

    }

    private static int dfs(int[] nums, int target, int startIndex, Integer [][] memo){
        if (target < 0) return 0;
        if (target == 0) return  1;

        if (memo[startIndex][target] != null) return memo[startIndex][target];

        int ways = 0;
        for (int i = startIndex; i < nums.length; i++){
           ways += dfs(nums, target - nums[i], i, memo);
        }

        memo[startIndex][target] = ways;
        return  ways;
    }
}
