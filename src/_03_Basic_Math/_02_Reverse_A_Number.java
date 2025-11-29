package _03_Basic_Math;

public class _02_Reverse_A_Number {
    static void main() {
        int n = 1234;
        int rev = 0;
        while(n != 0) {
            int dig = n %10;
            rev= rev*10 + dig;
            n/=10;
        }

        IO.println(rev);
    }
}
