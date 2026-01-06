package _05_Arrays._01_Basics;

public class _01_LargestElement {
    static int findLarge(int[] arr) {
        if(arr.length ==1) return arr[0];
        if (arr.length<1) return 0;

        int max = arr[0];
        for(int i:arr){
            if (i > max) max = i;
        }
        return max;

    }
    static void main() {
        int[] arr = {-2,-56,-1,};
        int max = findLarge(arr);
        IO.println("Largest element from array: "+max);
    }
}
