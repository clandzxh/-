package DFS;
import DFS.TreeNode;
public class 将有序数组转化成二叉搜索树 {
    public static TreeNode sortedArrayToBST(int[] nums){
        if(nums==null||nums.length==0){
            return null;
        }
        TreeNode res=sortArray(nums,0,nums.length-1);
        return res;
    }
    public static TreeNode sortArray(int[] nums,int i,int j){
        if(i>j)return null;
        if(i==j){
            return new TreeNode(nums[i]);
        }
        int mid=(i+j)/2;
        /*if(mid>=j||mid<=i){
            return new TreeNode(nums[mid]);
        }*/
        TreeNode currNode=new TreeNode(nums[mid]);
        currNode.left=sortArray(nums,i,mid-1);
        currNode.right=sortArray(nums,mid+1,j);
        return currNode;
    }
}
