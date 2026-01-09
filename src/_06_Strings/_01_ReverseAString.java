package _06_Strings;

public class _01_ReverseAString {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }

    }
    static void main() {

    }
}
