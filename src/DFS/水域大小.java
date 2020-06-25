package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 水域大小 {

    public int[] pondSizes(int[][] land){
        List<Integer> list=new ArrayList<>();
        int len=land.length,mid=land[0].length,temp;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < mid; j++) {
                temp=help(land,i,j);
                if(temp!=0){
                    list.add(temp);
                }
            }
        }
        int[] result=list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);
        return result;
    }
    public int help(int[][] land,int i,int j){
        int num=0;
        if(i<0||i>=land.length||j<0||j>=land[0].length||land[i][j]!=0){
            return num;
        }
        num++;
        land[i][j]=-1;
        num+=help(land,i+1,j);
        num+=help(land,i-1,j);
        num+=help(land,i,j+1);
        num+=help(land,i,j-1);
        num+=help(land,i+1,j-1);
        num+=help(land,i+1,j+1);
        num+=help(land,i-1,j+1);
        num+=help(land,i-1,j-1);
        return num++;
    }

}
