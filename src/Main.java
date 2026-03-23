import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // push all characters into stack
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        // pop characters to form reversed string
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}