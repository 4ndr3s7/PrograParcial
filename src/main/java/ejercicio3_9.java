package src.main.java;

public class ejercicio3_9 {
    public static void main(String[] args) {
        double[] temperaturas = {15.5, 17.2, 18.8, 20.1, 19.5, 22.0, 16.8, 14.9, 21.3, 23.0,
                25.5, 24.0, 22.5, 19.2, 18.0, 20.7, 21.1, 22.3, 23.7, 24.5,
                26.1, 27.0, 25.5, 22.8, 21.4, 19.0, 18.2, 20.6, 22.7, 24.1};

        double promedio = calcularPromedio(temperaturas);
        int diaMasCaluroso = encontrarDiaMasCaluroso(temperaturas);
        int diaMasFrio = encontrarDiaMasFrio(temperaturas);

        System.out.println("Promedio de temperatura: " + promedio);
        System.out.println("Día más caluroso: Día " + diaMasCaluroso);
        System.out.println("Día más frío: Día " + diaMasFrio);
    }

    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        return suma / temperaturas.length;
    }

    public static int encontrarDiaMasCaluroso(double[] temperaturas) {
        int dia = 0;
        double maxTemp = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
                dia = i;
            }
        }
        return dia + 1; // +1 para ajustar al formato de "Día X"
    }

    public static int encontrarDiaMasFrio(double[] temperaturas) {
        int dia = 0;
        double minTemp = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < minTemp) {
                minTemp = temperaturas[i];
                dia = i;
            }
        }
        return dia + 1; // +1 para ajustar al formato de "Día X"
    }
}