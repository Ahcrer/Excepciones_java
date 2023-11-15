package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = obtenerEdad(scanner);

        System.out.println("¡Gracias! Su edad es " + edad + ".");
    }

    private static int obtenerEdad(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Por favor, ingrese su edad: ");
                int edad = scanner.nextInt();

                if (edad > 0) {
                    return edad;
                } else {
                    System.out.println("Error: La edad debe ser un número mayor que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para la edad.");
                scanner.nextLine();
            }
        }
    }
}