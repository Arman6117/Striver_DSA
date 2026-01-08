package _05_Arrays._03_PrefixSum;

public class _01_MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0, arrSum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        for (int i : nums) {
            arrSum += i;
        }


        return sum - arrSum;


    }

    static void main() {

    }
}

