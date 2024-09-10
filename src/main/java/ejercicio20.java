package src.main.java;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.println("Introduce una serie de números (termina con 0): ");

        do {
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}


