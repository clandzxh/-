package 动态规划;

public class Palindrome {
    public static boolean IsPalindrome(String s,int i,int j){
        for (int k = i; k <=i+(j-i)/2 ; k++) {
            if(s.charAt(k)!=s.charAt(i+j-k)){
                return false;
            }
        }
        return true;
    }
}
