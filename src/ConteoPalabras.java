import java.util.Scanner;

public class ConteoPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.trim().split("\\s+");

        int numeroPalabras = palabras.length;

        System.out.println("La frase tiene " + numeroPalabras + " palabras.");

        scanner.close();
    }
}
