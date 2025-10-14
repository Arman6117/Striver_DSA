package _02_Patterns;

public class _09_Pattern {
    void main() {
        int n = 5;
        for (int i = 0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A'+i ; ch++) {
                IO.print(ch+" ");
            }
            IO.println();
        }
    }
}
