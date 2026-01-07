package _05_Arrays._02_Patterns;

public class _01_MovesAllZeros {
    public void moveZeroes(int[] nums) {
        if(nums== null ||  nums.length <1) {
            return;
        }

        int left  = 0;
        for(int right  =0; right < nums.length; right++) {
            if(nums[right] !=0) {
                int temp= nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    static void main() {

          int[] nums = {0,1,3,0,12};

        }
    }

