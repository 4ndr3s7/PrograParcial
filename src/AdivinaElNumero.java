import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Genera un número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza = 0;


        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("He pensado un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (adivinanza != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (adivinanza > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}
