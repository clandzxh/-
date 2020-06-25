package 动态规划;

import java.util.Arrays;

public class 石子游戏II {
    public int[][] dp;
    public int n;
    public int[] s;
    public int stoneGameII(int[] piles){
       n=piles.length;
       dp=new int[n][n];
       s=new int[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }
        s[n-1]=piles[n-1];
        for (int i = 0; i < n-1; i++) {
            s[n-i-2]=s[n-i-1]+piles[n-i-2];
        }
        return dfs(0,1);
    }
    public int dfs(int i,int M){
        if(i>=n){
            return 0;
        }
        if(dp[i][M]!=-1)return dp[i][M];
        if(2*M>n-i){
            dp[i][M]=s[i];
            return s[i];
        }
        int val=0;
        for (int X = 1; X <=2*M ; X++) {
            val=Math.max(val,s[i]-dfs(i+X,Math.max(M,X)));
        }
        dp[i][M]=val;
        return val;
    }
}
