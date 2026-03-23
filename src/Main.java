public class Main {
    public static void main(String[] args) {
        String word = "madam";

        PalindromeService service = new PalindromeService();

        if (service.isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}