package _02_Patterns;

public class _07_Pattern {
    void  main() {
        int n = 4;
        for(int i = 1;i<=n; i++) {
            for (int j = 1;j<=i;j++) {
                IO.print(j);
            }
            for(int j = 0; j<=2*(n-i);j++){
                IO.print(" ");
            }
            for (int j = i; j>= 1;j--) {
                IO.print(j);
            }
            IO.println();
        }
    }
}
