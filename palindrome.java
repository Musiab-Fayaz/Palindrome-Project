public class StringPalindrome {
    public static void main(String[] args) {
        String original = "Radar";
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();
        
        // Compare ignoring uppercase/lowercase differences
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
