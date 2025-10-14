package _02_Patterns;

public class _10_Pattern {
    static void main() {
        int n = 5;
        for (int i = 0;i<n;i++) {
            for (char ch = 'A'; ch <='A'+ n-i-1; ch++) {
                IO.print(ch + " ");
            }
            IO.println();
        }
    }
}
