package test;
import 动态规划.硬币;

import java.util.Scanner;

public class TestInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int output=硬币.waysToChange(input);
        System.out.println(output);
    }
}
