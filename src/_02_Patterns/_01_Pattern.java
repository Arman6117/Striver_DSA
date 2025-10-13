package _02_Patterns;

/*
     *****
     *****
     *****
 */
public class _01_Pattern {
    void main() {
        int n = 4;
        for (int i = 0; i <n ; i++)
        //For rows
        {
            for (int j = 0; j <n ; j++)
            //For columns
            {
                IO.print("*");
            }
            IO.println();
        }
    }
}
