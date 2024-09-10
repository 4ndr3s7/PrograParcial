import java.util.Scanner;

public class NumeroMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();

        // Llamar a la función que verifica si el número es mágico
        if (esNumeroMagico(n)) {
            System.out.println(n + " es un número mágico.");
        } else {
            System.out.println(n + " no es un número mágico.");
        }

        scanner.close();
    }

    // Función para verificar si un número es mágico
    public static boolean esNumeroMagico(int n) {
        int suma = n;

        // Repetir hasta que la suma se convierta en un solo dígito
        while (suma >= 10) {
            suma = sumarDigitos(suma);
        }

        // El número es mágico si el dígito final es 1
        return suma == 1;
    }

    // Función para sumar los dígitos de un número
    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10; // Sumar el último dígito
            num /= 10;        // Eliminar el último dígito
        }
        return suma;
    }
}
