package src.main.java;

public class ejercicio7 {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        int numero1 = 56;
        int numero2 = 98;

        if (numero1 == numero2) {
            System.out.println("Los números deben ser diferentes.");
        } else {
            int mcd = calcularMCD(numero1, numero2);
            System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
        }
    }
}