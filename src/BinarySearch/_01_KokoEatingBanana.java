package BinarySearch;

class SolutionKoko {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int n : piles) {
            right = Math.max(right, n);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;
            }
            //  if (totalHours > h) break;
            if (totalHours <= h) {
                answer = mid;        // valid speed
                right = mid - 1;     // try smaller
            } else {
                left = mid + 1;      // need faster speed
            }
        }

        return answer;
    }
}
public class _01_KokoEatingBanana {
}
