package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 组合{
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n,int k){
        if(n<=0||k<=0)return res;
        backTrace(1,n,k,new ArrayList<>());
        return res;
    }
    public void backTrace(int start,int n,int k,List<Integer> list){
        if(k<=0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <=n; i++) {
            list.add(i);
            backTrace(i+1,n,k-1,list);
            list.remove(list.size()-1);
        }
    }
}

