public class Main {
    public static void main(String[] args) {
        String word = "madam";

        // using Reverse strategy
        PalindromeStrategy strategy = new ReverseStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        if (context.check(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}