import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número total de elementos en la lista: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La lista debe tener al menos un número.");
            return;
        }

        System.out.println("Ingresa " + n + " números:");

        int numero = scanner.nextInt();
        int max = numero;
        int min = numero;

        for (int i = 1; i < n; i++) {
            numero = scanner.nextInt();
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        System.out.println("Número más grande: " + max);
        System.out.println("Número más pequeño: " + min);

        scanner.close();
    }
}

