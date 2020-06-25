package 树;

public class 二叉树中的列表 {
    public boolean isSubPath(ListNode head,TreeNode root){
        if(head==null)return true;
        if(root==null)return false;
        return isTrue(head,root)||isSubPath(head,root.left)||isSubPath(head,root.right);
    }
    public boolean isTrue(ListNode cur,TreeNode root){
        if(cur==null)return true;
        if(root==null)return false;
        if(cur.val==root.val){
            return isTrue(cur.next,root.left)||isTrue(cur.next,root.right);
        }else{
            return false;
        }
    }
}
