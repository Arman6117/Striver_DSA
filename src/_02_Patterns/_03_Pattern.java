package _02_Patterns;

/*
 ***
 **
 *
 */
public class _03_Pattern {
    void main() {
        int n = 4;
        for (int i = 0; i <n ; i++)
        //For rows
        {
            for (int j = n; j >i ; j--)
            //For columns
            {
                IO.print("* ");
            }
            IO.println();
        }
    }
}
