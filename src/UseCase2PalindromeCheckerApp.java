public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("     PALINDROME CHECKER APP - UC2    ");
        System.out.println("=====================================");

        // Hardcoded string
        String word = "madam";

        System.out.println("Hardcoded Word: " + word);

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition
        if (word.equals(reversed)) {
            System.out.println("Result: The word is a PALINDROME.");
        } else {
            System.out.println("Result: The word is NOT a palindrome.");
        }

        System.out.println("=====================================");
        System.out.println("Program executed successfully.");
    }
}