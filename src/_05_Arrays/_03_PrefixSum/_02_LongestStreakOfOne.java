package _05_Arrays._03_PrefixSum;

public class _02_LongestStreakOfOne {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currStreak = 0;
        int prevStreak = 0;
        for (int i : nums) {
            if (i == 1) {
                currStreak++;
            } else {
                prevStreak = currStreak;
                currStreak = 0;
            }
        }
        return Math.max(prevStreak, currStreak);
    }

    static void main() {

    }
}
