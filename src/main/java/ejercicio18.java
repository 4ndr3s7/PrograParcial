package src.main.java;
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de números debe ser mayor que 0.");
            return;
        }

        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        double promedio = (double) suma / n;
        System.out.println("El promedio de los " + n + " números es: " + promedio);

        scanner.close();
    }
}

