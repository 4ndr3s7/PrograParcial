package src.main.java;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int n = scanner.nextInt();

        if (esNumeroPerfecto(n)) {
            System.out.println(n + " es un número perfecto.");
        } else {
            System.out.println(n + " no es un número perfecto.");
        }

        scanner.close();
    }

    public static boolean esNumeroPerfecto(int n) {
        int sumaDivisores = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == n;
    }
}
