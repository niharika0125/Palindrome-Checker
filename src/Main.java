public class Main {
    public static void main(String[] args) {
        String word = "Madam";

        // convert to lowercase
        String normalized = word.toLowerCase();

        String reversed = "";

        // reverse string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println(word + " is a Palindrome (Case-Insensitive)");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}