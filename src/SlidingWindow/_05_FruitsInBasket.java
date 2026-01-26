package SlidingWindow;

class SolutionFruits {
    public int totalFruit(int[] fruits) {
        int[] freq = new int[fruits.length];
        int l = 0, distinct = 0, maxLen = 0;

        for (int r = 0; r < fruits.length; r++) {
            if (freq[fruits[r]] == 0) {
                distinct++;
            }
            freq[fruits[r]]++;

            while (distinct > 2) {
                freq[fruits[l]]--;
                if (freq[fruits[l]] == 0) {
                    distinct--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}

public class _05_FruitsInBasket {
}
