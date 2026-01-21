package _06_Strings.SlidingWindow;

import java.util.*;
class SolutionOfAnagram {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        int[] need = new int[26];
        int[] window  = new int[26];

        for(char c: p.toCharArray()){
            need[c- 'a']++;
        }
        int k = p.length();
        for(int i = 0; i<s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if(i >=k) {
                window[s.charAt(i-k)- 'a']--;
            }
            if(i>= k-1 && Arrays.equals(need,window)) {
                li.add(i-k+1);
            }
        }
        return li;
    }
}
public class _02_AllAnagramsInString {
}
