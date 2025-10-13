package _02_Patterns;

public class _05_Pattern {
    void main() {
        int n= 5;
        for(int i = 0; i<n;i++) {
            for(int j = 0;j<i+1;j++) {
                IO.print("* ");
            }
            IO.println();
        }
        for(int i = n-1;i>0;i--) {
            for(int j = 0;j<i;j++) {
                IO.print("* ");
            }
            IO.println();
        }
    }
}
