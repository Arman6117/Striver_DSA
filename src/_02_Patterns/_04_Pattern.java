package _02_Patterns;

/*
         *
       ***
     *****
   *******
 **********
 */
public class _04_Pattern {
    void main() {
        int n = 5;
        for (int i = 0; i <n ; i++)
        //For rows
        {
            for (int j = 0; j <n-i-1 ; j++) {
                IO.print("  ");
            }
            for (int j =  0; j < 2*i+1;j++){
                IO.print("*");
            }
            for (int j = 0; j <n-i-1 ; j++) {
                IO.print("  ");
            }
            IO.println();
        }

        for (int i = 0; i <n ; i++)
        //For rows
        {
            for (int j = 0; j <i ; j++) {
                IO.print("  ");
            }
            for(int j=0;j< 2*n -(2*i +1);j++){
                IO.print("*");
            }
            for (int j = 0; j <n-i ; j++) {
                IO.print("  ");
            }
            IO.println();
        }
    }
}
