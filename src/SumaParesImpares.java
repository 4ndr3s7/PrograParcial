import java.util.Scanner;

public class SumaParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número total de elementos: ");
        int n = scanner.nextInt();

        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("Ingresa " + n + " números:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }

        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);

        scanner.close();
    }
}

