import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word = "madam";

        Deque<Character> deque = new LinkedList<>();

        // add all characters to deque
        for (char c : word.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}