package PrefixSum;

class SolutionPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum =0,rightSum = 0,pivot = -1,totalSum =0;
        for(int n:nums) {
            totalSum += n;
        }


        for(int i = 0; i<nums.length;i++) {
            rightSum = totalSum - leftSum -nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
public class _03_PivotIndex {
}
