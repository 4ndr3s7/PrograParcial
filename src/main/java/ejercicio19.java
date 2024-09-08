package src.main.java;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}

