package src.main.java;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        texto = texto.toLowerCase();

        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);

        scanner.close();
    }
}
