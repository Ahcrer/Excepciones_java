package Ejercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numerador = obtenerNumero("Ingrese el numerador: ", scanner);
        double denominador = obtenerNumero("Ingrese el denominador: ", scanner);

        try {
            double resultado = dividir(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero. Por favor, ingrese un denominador diferente.");
        }
    }

    private static double obtenerNumero(String mensaje, Scanner scanner) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }
    }

    private static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return numerador / denominador;
    }
}
