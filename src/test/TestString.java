package test;

import java.util.List;
import java.util.Scanner;
import 动态规划.*;
import 双指针.*;

public class TestString {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //boolean flag=验证回文子串II.validPalindrome(str);
        //
        List<Integer> res=划分字母区间.partitionLables(str);
        System.out.println(res);
    }
}
