package _02_Patterns;

public class _16_Pattern {
    static void main() {
        int n = 4;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j<n;j++) {

                if(j==0 || i==0|| i==n-1 || j==n-1) {

                IO.print("*");
                } else {
                    IO.print(" ");
                }
            }


//            for (int j = n*2; j>=i;j--) {
//                IO.print("*");
//            }
            IO.println();
        }
    }
}
