package test;

import java.util.List;
import java.util.Scanner;
import 动态规划.*;
import 双指针.*;
import 回溯算法.*;
import 字符串.*;

public class TestString {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //boolean flag=验证回文子串II.validPalindrome(str);
        //
        //List<Integer> res=划分字母区间.partitionLables(str);
        //有重复字符串的排列组合 a=new 有重复字符串的排列组合();
        //String[] res=a.permutation(str);
        翻转字符串里的单词 a=new 翻转字符串里的单词();
        System.out.println(a.reverseWords(str));
    }
}
