package 动态规划;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 最低票价 {
    public static int mincostTickets(int[] days,int[] costs){
       int len=days.length,maxDay=days[len-1],minDay=days[0];
       int[] dp=new int[maxDay+31];
        for (int i = maxDay,j=days.length-1; i >=minDay ; i--) {
            if(i==days[j]){
                dp[i]=Math.min(dp[i+1]+costs[0],dp[i+7]+costs[1]);
                dp[i]=Math.min(dp[i],dp[i+30]+costs[2]);
                j--;
            }else{
                dp[i]=dp[i+1];
            }
        }
        return dp[minDay];
    }
}
