public class Main {

    // recursive function
    public static boolean isPalindrome(String str, int start, int end) {
        // base case
        if (start >= end) {
            return true;
        }

        // if mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "madam";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}