import java.util.Stack;
public class IsPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reverseInput = "";
        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }
        if (input.equals(reverseInput))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
