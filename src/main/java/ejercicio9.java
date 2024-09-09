package src.main.java;

public class ejercicio9 {
    public static void main(String[] args) {
        String text = "Ana";
        boolean isPalindrome = isPalindrome(text);

        if (isPalindrome) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversedText);
    }
}
