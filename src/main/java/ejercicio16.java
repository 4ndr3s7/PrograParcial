package src.main.java;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero de mas de un digito: ");
        int numero = scanner.nextInt();

        int suma = calcularSumaDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        scanner.close();
    }

        public static int calcularSumaDigitos (int numero){
            int suma = 0;

            while (numero != 0) {
                suma += numero % 10;
                numero /= 10;
            }

            return suma;
        }
    }
