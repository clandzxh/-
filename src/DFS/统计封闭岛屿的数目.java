package DFS;

public class 统计封闭岛屿的数目 {
    public int closedIsland(int[][] grid){
        int len=grid.length,wid=grid[0].length,res=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                if(grid[i][j]==0) {
                    if (isResult(grid, i, j)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public boolean isResult(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return false;
        }
        if(grid[i][j]==1||grid[i][j]==-1){
            return true;
        }
        grid[i][j]=-1;
        boolean up = isResult(grid,i-1,j);
        boolean down = isResult(grid,i+1,j);
        boolean left = isResult(grid,i,j-1);
        boolean right = isResult(grid,i,j+1);
        if(up && down && left && right){
            return true;
        }
        return false;
    }
}
