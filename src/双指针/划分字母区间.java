package 双指针;

import java.util.ArrayList;
import java.util.List;

public class 划分字母区间 {
    static List<Integer> res=new ArrayList<>();
    public static List<Integer> partitionLables(String S){
        int lastIndex=0;
        while(lastIndex< S.length()) {
            lastIndex=help(S, lastIndex)+1;
        }
        return res;
    }
    private static int help(String S,int first){
        String firstChar=String.valueOf(S.charAt(first));
        //List<Character> list=new ArrayList<>();
        //list.add(S.charAt(first));
        int last=S.lastIndexOf(S.charAt(first));
        int cur=first;
        while (cur<last){
            char curChar=S.charAt(cur);
            int index= S.lastIndexOf(String.valueOf(curChar));
            if(index>last){
                last=index;
            }
            cur++;


        }
        res.add(last-first+1);
        return last;
    }
}
