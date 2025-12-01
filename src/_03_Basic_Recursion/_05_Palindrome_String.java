package _03_Basic_Recursion;

public class _05_Palindrome_String {
    static boolean isPalindrome(String str, int left,int right) {
        if(left > right) {
            return true;
        }

        if (str.charAt(left)  != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str,left+1,right-1);
    }
    static void main() {
        String str= "ABCDBA";
       IO.println(isPalindrome(str, 0, str.length()-1));
    }
}
