package 动态规划;

public class 零钱兑换 {
    public static int coinChange(int[] coins,int amount){
        if(coins.length==0)return -1;
        int[] dp=new int[amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=amount+1;
        }
        dp[0]=0;
        for (int i = 1; i < dp.length; i++) {
            for (int item:coins){
                if(i-item>=0) {
                    dp[i] = Math.min(dp[i - item] + 1, dp[i]);
                }
            }
        }
        return dp[amount]==(amount+1)?-1:dp[amount];
    }
}
