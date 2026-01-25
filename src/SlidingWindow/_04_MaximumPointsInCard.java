package SlidingWindow;
class SolutionMaxPoints {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0;

        for (int i  = 0; i<k-1;i++) {
            leftSum += cardPoints[i];
        }
        int rightIndex = cardPoints.length-1;
        for(int i = k-1; i>=0;i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
        }//
        return Math.max(leftSum,rightSum);
    }
}
public class _04_MaximumPointsInCard {
}
