package _04_Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class _01_NumberHashing {
    static void main() {
      int[] arr = {1,2,2,3,1,6,7};
      int[] hash = new int[arr.length];
//        Scanner sc =new Scanner(System.in);
        for (int i = 0; i <arr.length-1 ; i++) {
            hash[arr[i]]+= 1;
        }

        IO.println("Enter a number to count: ");
       int n =  Integer.parseInt(IO.readln());
        IO.println(hash[n]);
    }
}
