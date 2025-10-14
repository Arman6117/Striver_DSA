package _02_Patterns;

public class _14_Pattern {
    void  main() {
        int n = 5;
        for(int i = 1;i<=n; i++) {
            for(int j = 0; j<=n-i; j++) {
                IO.print("*");
            }
            for(int j=2; j< 2*(i); j++) {
                IO.print(" ");
            }
            for(int j = 0; j<=n-i; j++) {
                IO.print("*");
            }
            IO.println();

        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1;j<=i;j++) {
                IO.print("*");
            }
            for(int j = 2; j<=2*(n-i);j++){
                IO.print(" ");
            }
            for (int j = i; j>= 1;j--) {
                IO.print("*");
            }
            IO.println();
        }
    }
}
