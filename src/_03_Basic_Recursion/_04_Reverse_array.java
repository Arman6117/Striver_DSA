package _03_Basic_Recursion;

import java.util.Arrays;

public class _04_Reverse_array {
    static int[]rev (int[] arr,int p,int q) {
        if(p > q) {
            return arr;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        return rev(arr, p+1, q-1);
    }
    static void main() {
      int[] arr = {10,20,30,40,50};
      int[] ans = rev(arr,0,arr.length-1);
      IO.println(Arrays.toString(ans));
    }
}
