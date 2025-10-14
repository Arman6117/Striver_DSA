package _02_Patterns;

public class _12_Pattern {
    static void main() {
        int n = 5;
        for (int i = 0;i<n;i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                IO.print(" ");
            }
            char ch = 'A';
            int breakP = (2*i+1)/2;
            for(int j = 0; j<2*i+1; j++) {
                if(j >= breakP) {
                    IO.print(ch--);
                }else  {

                IO.print(ch++);
                }
            }
            for (int j = 0; j <n-i-1 ; j++) {
                IO.print(" ");
            }
            IO.println();
        }
    }
}
