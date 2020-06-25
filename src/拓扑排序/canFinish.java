package 拓扑排序;

import java.util.ArrayDeque;
import java.util.Queue;

public class canFinish {
    public boolean canFinish(int numCourses,int[][] prerequisites){
        int [] indegree=new int[numCourses];
        for (int[] pre:prerequisites){
            indegree[pre[0]]++;
        }
        Queue<Integer> queue=new ArrayDeque<>();
        for (int i = 0; i <indegree.length ; i++) {
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int i=0;
        while(!queue.isEmpty()){
            Integer curr=queue.poll();
            i++;
            for (int[] pre:prerequisites){
                if(pre[1]==curr){
                    indegree[pre[0]]--;
                    if(indegree[pre[0]]==0){
                        queue.offer(pre[0]);
                    }
                }
            }
        }
        return i==numCourses?true:false;
    }
}
