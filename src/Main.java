import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word = "madam";

        LinkedList<Character> list = new LinkedList<>();

        // add characters to LinkedList
        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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