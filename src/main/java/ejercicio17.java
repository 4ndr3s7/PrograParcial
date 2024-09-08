package src.main.java;
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Introduce el tercer número: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Los números ordenados de menor a mayor son: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}