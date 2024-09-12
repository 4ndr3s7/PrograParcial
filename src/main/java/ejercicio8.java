package src.main.java;

public class ejercicio8 {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        return Math.abs(a * b) / calcularMCD(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;

        int mcm = calcularMCM(num1, num2);
        System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcm);
    }
}