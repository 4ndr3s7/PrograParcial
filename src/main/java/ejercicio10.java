package src.main.java;

public class ejercicio10 {

    public static int sumaSerieAritmetica(int n, int a, int d) {

        int suma = n * (2 * a + (n - 1) * d) / 2;
        return suma;
    }

    public static void main(String[] args) {

        int n = 5;
        int a = 2;
        int d = 3;

        int resultado = sumaSerieAritmetica(n, a, d);

        System.out.println("La suma de los primeros " + n + " términos de la serie aritmética es: " + resultado);
    }
}
