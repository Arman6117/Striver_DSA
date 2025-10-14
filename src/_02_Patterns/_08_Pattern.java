package _02_Patterns;

public class _08_Pattern {
     void main() {
        int n = 5;
        int s =1;
         for (int i = 1; i <=n ; i++) {
             for (int j = 0; j <i ; j++) {
                 IO.print(s+" ");
                 s= s+1;
             }
             IO.println();
         }
    }
}
