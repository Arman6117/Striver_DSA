package SlidingWindow;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            // add current char to window
            window[s2.charAt(i) - 'a']++;

            // keep window size fixed to k
            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            // compare when window size == k
            if (i >= k - 1 && java.util.Arrays.equals(need, window)) {
                return true;
            }
        }
        return false;
    }
}

public class _01_PermutationInString {
}
