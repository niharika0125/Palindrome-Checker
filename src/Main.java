public class Main {

    // Method 1: Reverse String
    public static boolean reverseMethod(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Character Array
    public static boolean arrayMethod(String word) {
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // measure reverse method
        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        // measure array method
        long start2 = System.nanoTime();
        arrayMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1) + " ns");
        System.out.println("Array Method Time: " + (end2 - start2) + " ns");
    }
}