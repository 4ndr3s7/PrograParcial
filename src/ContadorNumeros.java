import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número total de elementos: ");
        int n = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingresa " + n + " números:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        scanner.close();
    }
}

