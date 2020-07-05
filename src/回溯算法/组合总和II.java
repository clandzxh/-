package 回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 组合总和II {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
       if(candidates==null||candidates.length==0){
           return res;
       }
        Arrays.sort(candidates);
       backTrace(0,candidates,target,new ArrayList<>());
       return res;
    }
    public void backTrace(int start,int[] candidates,int target,List<Integer> list){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(list));
        }else{
            for (int i = start; i <candidates.length ; i++) {
                if(i>start&&candidates[i]==candidates[i-1]){
                    continue;
                }
                list.add(candidates[i]);
                backTrace(i+1,candidates,target-candidates[i],list);
                list.remove(list.size()-1);
            }
        }

    }
}
