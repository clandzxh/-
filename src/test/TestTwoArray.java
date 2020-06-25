package test;

import 动态规划.最大的以1为边界的正方形;
import DFS.*;

import java.util.Scanner;

public class TestTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt(),total=len*len;
        int[][] input=new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                input[i][j]=sc.nextInt();
            }
        }
        //int output=最大的以1为边界的正方形.largest1BorderedSquare(input);
        int output=飞地的数量.numEnclaves(input);
        System.out.println(output);

    }
}
