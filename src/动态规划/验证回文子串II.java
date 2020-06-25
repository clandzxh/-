package 动态规划;

public class 验证回文子串II {
    public static  boolean validPalindrome(String s){
       int left=0,right=s.length()-1;
       while(left<right){
           if (s.charAt(left)!=s.charAt(right)){
               return Palindrome.IsPalindrome(s,left,right-1)||Palindrome.IsPalindrome(s,left+1,right);
           }
           left++;
           right--;
       }
       return true;
    }
}
