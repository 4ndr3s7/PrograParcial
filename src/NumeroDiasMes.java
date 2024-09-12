import java.util.Scanner;

public class NumeroDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();

        int dias = 0;

        // Determina el número de días en el mes
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                // Verificar si es un año bisiesto
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    dias = 29;  // Año bisiesto
                } else {
                    dias = 28;  // Año no bisiesto
                }
                break;
            default:
                System.out.println("Mes inválido.");
                return;
        }

        // Imprimir el número de días en el mes
        System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");

        scanner.close();
    }
}
