package 双指针;

import java.util.Arrays;

public class 两数之和 {
    public static int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
