package _02_Patterns;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class _02_Pattern {
    void main() {
        int n = 5;
        for (int i = 0; i <n ; i++)
        //For rows
        {
            for (int j = 0; j <i+1 ; j++)
            //For columns
            {
                IO.print("* ");
            }
            IO.println();
        }
    }
}
