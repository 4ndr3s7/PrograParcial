package src.main.java;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        int numeroInvertido = invertirDigitos(n);

        System.out.println("El número invertido es: " + numeroInvertido);
    }

    public static int invertirDigitos(int n) {
        int numeroInvertido = 0;

        while (n != 0) {
            int digito = n % 10;  // Obtiene el último dígito
            numeroInvertido = numeroInvertido * 10 + digito;  // Agrega el dígito invertido
            n /= 10;  // Elimina el último dígito
        }

        return numeroInvertido;
    }
}
