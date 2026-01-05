package _04_Hashing;

public class _02_CharacterHashing {
    public static void main(String[] args) {

        char[] arr = {'A', 'A', 'B', 'E', 'A'};

        // Hash array should be size 26 for uppercase letters
        int[] hash = new int[26];

        // Build the frequency map
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i] - 'A']++;
        }

        // Query for a character
        IO.println("Enter a character to count: ");
        String input = IO.readln();
        char ch = input.charAt(0); // Get first character from string

        // Print frequency of queried character
        IO.println("Frequency of " + ch + ": " + hash[ch - 'A']);
    }
}
