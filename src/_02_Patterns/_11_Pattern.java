package _02_Patterns;

public class _11_Pattern {
    static void main() {
        int n = 5;
        char ch = 'A';
        for (int i = 0; i <n ; i++) {
            for (char j = 0; j < i +1; j++) {
             IO.print(ch);
            }
             ch++;
            IO.println();
        }
    }
}
