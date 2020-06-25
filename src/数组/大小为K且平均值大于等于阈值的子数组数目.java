package 数组;

public class 大小为K且平均值大于等于阈值的子数组数目 {
    public static int numOfSubarrays(int[] arr,int k,int threshold){
        int sum=0,res=0,index=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        do {
            res=(sum>=threshold*k?++res:res);
            sum-=arr[index];
            index++;
            if(index<arr.length-k+1) {
                sum += arr[index + k - 1];
            }
        }while (index<arr.length-k+1);
        return res;
    }
}
