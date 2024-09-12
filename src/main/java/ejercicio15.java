package src.main.java;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (esNumeroArmstrong(numero)) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }

        scanner.close();
    }

    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0, digitos = 0, temp = numero;

        while (temp != 0) {
            temp /= 10;
            digitos++;
        }

        temp = numero;
        while (temp != 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, digitos);
            temp /= 10;
        }

        return suma == numero;
    }
}