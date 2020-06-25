package DFS;

public class 飞地的数量 {
    public static int numEnclaves(int[][] A){
        int len=A.length,wid=A[0].length,num=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                if(A[i][j]==1) {
                    int temp=help(A,i,j);
                    if(temp>0) {
                        num += temp;
                    }
                }
            }
        }
        return num;
    }
    public static int help(int[][] grid,int i,int j){
        int num=0;
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
            return num;
        }
        if(i==0||i==grid.length-1||j==0||j==grid[0].length-1){
            if(grid[i][j]==1) {
                grid[i][j]=0;
                help(grid,i-1,j);
                help(grid,i+1,j);
                help(grid,i,j-1);
                help(grid,i,j+1);
                return -1;
            }
            return num;
        }
        if(grid[i][j]==1){
            num++;
        }
        grid[i][j]=0;
        int res1=help(grid,i-1,j);
        int res2=help(grid,i+1,j);
        int res3=help(grid,i,j-1);
        int res4=help(grid,i,j+1);
        if(res1==-1||res2==-1||res3==-1||res4==-1){
            return -1;
        }
        num+=res1;
        num+=res2;
        num+=res3;
        num+=res4;
        return num;
    }
}
