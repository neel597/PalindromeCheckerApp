import java.util.Stack;
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   PALINDROME CHECKER APP - UC5         ");
        System.out.println("=========================================");
        String input = "madam";
        System.out.println("Input String: " + input);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
        System.out.println("=========================================");
        System.out.println("Program executed successfully.");
    }
}