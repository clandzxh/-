package 递归;

public class 猜数字大小II {
    public int getMoneyAmount(int n){
        return calculate(1,n);
    }
    public int calculate(int low,int high){
        if(low>=high){
            return 0;
        }
        int minNum=Integer.MAX_VALUE;
        for (int i = low; i <=high ; i++) {
            int res=i+Math.max(calculate(low,i-1),calculate(i+1,high));
            minNum= Math.min(res,minNum);
        }
        return minNum;
    }
}
