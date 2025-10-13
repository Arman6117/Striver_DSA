package _02_Patterns;

public class _06_Pattern {
    void main() {
        int n = 5;
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 0; j <= i; j++) {
                IO.print(start+" ");
                start = 1- start;
            }
        IO.println();
        }
    }
}

