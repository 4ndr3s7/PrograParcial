package src.main.java;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero que desea generar en secuencia: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("debe ser un numero positivo.");
        } else {
            System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");

            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");

                int nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
        }

        scanner.close();
    }
}
