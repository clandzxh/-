package 拓扑排序;

import java.util.ArrayDeque;
import java.util.Currency;
import java.util.Queue;

public class canFinishII {
    public int[] findOrder(int numCourses,int[][] prerequisites){
        int[] result=new int[numCourses];
        int[] indegree=new int[numCourses];
        for (int[] pre:prerequisites){
            indegree[pre[0]]++;
        }
        Queue<Integer> queue=new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int i=0;
        while(!queue.isEmpty()){
            Integer curr=queue.poll();
            result[i++]=curr;
            for (int[] pre:prerequisites){
                if(pre[1]==curr){
                    indegree[pre[0]]--;
                    if(indegree[pre[0]]==0){
                        queue.offer(pre[0]);
                    }
                }

            }

        }
        return i== numCourses?result:new int[]{};
    }
}
