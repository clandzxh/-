package test;

import 动态规划.删除与获得点数;
import 动态规划.零钱兑换;
import 动态规划.最低票价;
import DFS.*;
import 双指针.*;
import 数组.大小为K且平均值大于等于阈值的子数组数目;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] source=new int[len];
        for (int i = 0; i < len; i++) {
            source[i]=sc.nextInt();
        }
        /*int tar=sc.nextInt();
        int[] costs=new int[tar];
        for (int i = 0; i < tar; i++) {
            costs[i]=sc.nextInt();
        }*/
        //int tar=sc.nextInt();
        //boolean flag=连续的子数组和.checkSubarraySum(source,tar);
        //int result= 删除与获得点数.deleteAndEarn(source);
        //int result=零钱兑换.coinChange(source,tar);
        //int result=最低票价.mincostTickets(source,costs);
        //TreeNode result=将有序数组转化成二叉搜索树.sortedArrayToBST(source);
        //int k=sc.nextInt();
        //int threshold=sc.nextInt();
        //int result=大小为K且平均值大于等于阈值的子数组数目.numOfSubarrays(source,k,threshold);
        //int[] result=两数之和.twoSum(source,k);
        List<List<Integer>> result=三数之和.threeSum(source);
        System.out.println(result.toString());
    }
}
