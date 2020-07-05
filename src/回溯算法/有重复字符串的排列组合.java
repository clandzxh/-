package 回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 有重复字符串的排列组合 {
    List<String> res=new ArrayList<>();
    public String[] permutation(String S){
        if(S==null){
            return new String[0];
        }
        char[] input=S.toCharArray();
        int len= S.length();
        boolean[] used=new boolean[len];
        backTrack(input,0,new StringBuilder(),used);
        return (String[]) res.toArray();
    }
    public void backTrack(char[] input,int depth,StringBuilder cur,boolean[] used){
        if(depth==input.length){
            res.add(new String(cur));
            return;
        }
        for (int i = 0; i <input.length ; i++) {
            if(!used[i]){
                if(i>0&&input[i]==input[i-1]&&!used[i-1]){
                    continue;
                }
                cur.append(input[i]);
                used[i]=true;
                backTrack(input,depth+1,cur,used);
                used[i]=false;
                cur.delete(cur.length()-1,cur.length());
            }
        }
    }
}
