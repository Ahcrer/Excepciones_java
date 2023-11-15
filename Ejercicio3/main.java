package Ejercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        Scanner scanner = new Scanner(System.in);

        try {
            int indice = obtenerIndice(scanner);
            int elemento = accederArreglo(arreglo, indice);
            System.out.println("El elemento en el índice " + indice + " es: " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango del arreglo.");
        }
    }

    private static int obtenerIndice(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Ingrese un índice para acceder al arreglo: ");
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.nextLine();
            }
        }
    }

    private static int accederArreglo(int[] arreglo, int indice) {
        return arreglo[indice];
    }
}
