package _05_Arrays._02_Patterns;

public class _02_RemoveDuplicates {
    public int removeElement(int[] nums, int val) {
        if(nums== null ||  nums.length <1) {
            return 1;
        }

        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
    static void main() {

    }
}
