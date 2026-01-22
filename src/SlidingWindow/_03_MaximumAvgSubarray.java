package SlidingWindow;

class SolutionAvg {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int left = 0, sum =0;
        for(int right = 0; right<nums.length;right++) {
            sum += nums[right];
            if(right >=k){

                sum -= nums[left];
                left++;
            }
            if(right>= k-1) {


                maxAvg = Math.max((double)sum/k,maxAvg);
            }
        }
        return maxAvg;
    }
}
public class _03_MaximumAvgSubarray {
}
