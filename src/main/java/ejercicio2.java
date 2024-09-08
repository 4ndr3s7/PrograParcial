package src.main.java;

import java.util.Scanner;
public class ejercicio2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número entero: ");
            int n = scanner.nextInt();

            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }


