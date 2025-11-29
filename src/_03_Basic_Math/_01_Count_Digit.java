package _03_Basic_Math;

public class _01_Count_Digit {
    static void main() {
        int n = 1234;
        int cnt = 0;
        while(n != 0) {
            n /= 10;
            cnt++;
        }
        IO.print(cnt);
    }
}
