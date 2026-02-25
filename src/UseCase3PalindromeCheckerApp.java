public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   PALINDROME CHECKER APP - UC3         ");
        System.out.println("=========================================");

        // Original string
        String original = "level";

        System.out.println("Original String: " + original);

        // Reverse string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("=========================================");
        System.out.println("Program executed successfully.");
    }
}