package _03_Basic_Recursion;

public class _01_Print_N_To_1 {
    static void printN (int n) {
        if (n ==0) return;
        IO.println(n);
        n--;
        printN(n);
    }

    static void main() {
        int n = 5;
        printN(n);
    }
}
