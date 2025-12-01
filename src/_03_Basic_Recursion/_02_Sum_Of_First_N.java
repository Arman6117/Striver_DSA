package _03_Basic_Recursion;

public class _02_Sum_Of_First_N {
    static int sumN (int n,int sum) {
        if(n == 0) {
            return sum;
        }
        sum += n;
        n--;
        return sumN(n,sum);
    }
    static void main() {
        int n = 4,sum=0;
        IO.println(sumN(n,sum));
    }
}
