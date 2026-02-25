/**
 * =========================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This program converts a String into a character array
 * and checks palindrome using the two-pointer technique.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   PALINDROME CHECKER APP - UC4         ");
        System.out.println("=========================================");

        // Input string
        String input = "radar";

        System.out.println("Input String: " + input);

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("=========================================");
        System.out.println("Program executed successfully.");
    }
}