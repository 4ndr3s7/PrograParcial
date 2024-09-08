import java.util.Scanner;

public class ConteoDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();

        // Convertimos el número a su valor absoluto para manejar números negativos
        n = Math.abs(n);

        // Si el número es 0, sabemos que tiene 1 dígito
        if (n == 0) {
            System.out.println("El número tiene 1 dígito.");
        } else {
            // Contamos los dígitos dividiendo repetidamente por 10
            int contador = 0;
            while (n > 0) {
                n /= 10;
                contador++;
            }

            System.out.println("El número tiene " + contador + " dígitos.");
        }

        scanner.close();
    }
}
