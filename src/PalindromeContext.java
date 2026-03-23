public class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.isPalindrome(word);
    }
}