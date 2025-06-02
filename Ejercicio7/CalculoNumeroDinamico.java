
/*Desarrollar un programa que permita almacenar cualquier valor numérico hasta 
que el usuario decida terminar el programa. 
Se debe calcular el promedio de los números introducidos y la cantidad de números positivos*/


import java.util.ArrayList;
import java.util.Scanner;

public class CalculoNumeroDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double suma = 0;
        int cantidadPositivos = 0;
        String continuar = "s"; // Para controlar el bucle

        System.out.println("--- Calculadora de Promedio y Positivos ---");
        System.out.println("Ingrese números. Presione 'n' para terminar.");

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Ingrese un número: ");
            try {
                double numero = scanner.nextDouble();
                numeros.add(numero); // Agrega el número a la lista
                suma += numero;

                if (numero > 0) {
                    cantidadPositivos++;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer del scanner
                continue; // Vuelve al inicio del bucle
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            continuar = scanner.nextLine();
        }

        System.out.println("\n--- Resultados ---");
        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            double promedio = suma / numeros.size();
            System.out.println("Números ingresados: " + numeros.size());
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        }

        scanner.close();
    }
}