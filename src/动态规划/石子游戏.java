package 动态规划;

public class 石子游戏 {
    public boolean stoneGame(int[] piles){
        int n=piles.length;
        int[][][] dp=new int[n][n][2];
        for (int i = 0; i < n; i++) {
            dp[i][i][0]=piles[i];
            dp[i][i][1]=0;
        }
        for (int l = 2; l <=n ; l++) {
            for (int i = 0; i <= n-l; i++) {
                int j=l+i-1;
                int left=piles[i]+dp[i+1][j][1];
                int right=piles[j]+dp[i][j-1][1];
                if(left<right){
                    dp[i][j][0]=right;
                    dp[i][j][1]=dp[i][j-1][0];
                }else{
                    dp[i][j][0]=left;
                    dp[i][j][1]=dp[i+1][j][0];
                }
            }
        }
        return (dp[0][n-1][0]-dp[0][n-1][1])>0?true:false;
    }
}
