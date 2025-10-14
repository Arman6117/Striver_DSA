package _02_Patterns;

public class _13_Pattern {
    static void main() {
        int n = 5;

        for(int i = 0;i <n; i++) {
            for (char ch = (char) ('E' - i); ch <='E'; ch++) {
                IO.print(ch+" ");

            }
            IO.println();
        }
    }
}
