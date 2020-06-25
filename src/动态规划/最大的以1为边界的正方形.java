package 动态规划;

public class 最大的以1为边界的正方形 {
    public static int largest1BorderedSquare(int[][] grid){
      int n=grid.length,m=grid[0].length,res=0;
      int[][][] dp=new int[n+1][m+1][2];
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                int d=0;
                if(grid[i-1][j-1]==1){
                    dp[i][j][0]=dp[i][j-1][0]+1;
                    dp[i][j][1]=dp[i-1][j][1]+1;
                    d=Math.min(dp[i][j-1][0],dp[i-1][j][1]);
                    while(d>0){
                        if(dp[i][j-d][1]>d&&dp[i-d][j][0]>d)break;
                        d--;
                    }
                    res=Math.max(res,d+1);
                }
            }
        }
        return res*res;
    }
}
