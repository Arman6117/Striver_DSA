package _03_Basic_Recursion;

public class _03_Factorial {
    static int fact(int n) {
        if(n ==0) {
            return 0;
        }
        if(n == 1) {
            return  n;
        }
         return fact(n - 1) * n;
    }
    static void main() {
        IO.println(fact(5));
    }
}
