package PrefixSum;

import java.util.HashMap;

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int currSum= 0,l=0,len =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0; i<nums.length; i++) {
            currSum += nums[i];
            if(map.containsKey(currSum-k)) {
                len = Math.max(i-map.get(currSum-k),len);

            }
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);

            }

        }
        return len;
    }
}

public class _02_LongestSubArraySumEqualsToK {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, -1, 5, -2, 3};
        int k1 = 3;
        System.out.println(sol.maxSubArrayLen(nums1, k1)); // Expected: 4

        int[] nums2 = {-2, -1, 2, 1};
        int k2 = 1;
        System.out.println(sol.maxSubArrayLen(nums2, k2)); // Expected: 2

        int[] nums3 = {1, 2, 3};
        int k3 = 6;
        System.out.println(sol.maxSubArrayLen(nums3, k3)); // Expected: 3

        int[] nums4 = {1, -1, 1, -1, 1};
        int k4 = 0;
        System.out.println(sol.maxSubArrayLen(nums4, k4)); // Expected: 4
    }
}
