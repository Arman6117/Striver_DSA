package TwoPointers;

class SolutionMaxArea {
    public int maxArea(int[] height) {
        int l = 0 ,r =height.length-1, area = 0;

        while(l < r) {
            int h = Math.min(height[l], height[r]);
            int w = r-l;
            area = Math.max(area,h*w);
            if(height[l] < height[r]) {
                l++;
            }else {
                r--;
            }


        }
        return area;
    }
}
public class _01_MaximumWaterInContainer {
}
