
/*Desarrollar un programa que permita leer múltiples valores numéricos hasta que el usuario decida detener la lectura. 
Después, usará la colección TreeSet para mostrar el listado de los números ingresados ordenados de menor a mayor. */


import java.util.Scanner;
import java.util.TreeSet; // Importamos TreeSet

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TreeSet almacena elementos únicos y los ordena automáticamente
        TreeSet<Double> numerosOrdenados = new TreeSet<>();
        String continuar = "s"; // Para controlar el bucle

        System.out.println("--- Ingreso de Números y Ordenamiento con TreeSet ---");
        System.out.println("Ingrese números. Presione 'n' para terminar.");

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Ingrese un número: ");
            try {
                double numero = scanner.nextDouble();
                numerosOrdenados.add(numero); // Agrega el número al TreeSet
                // TreeSet automáticamente maneja duplicados (solo se añade una vez)
                // y los mantiene ordenados.
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer del scanner
                continue; // Vuelve al inicio del bucle
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            continuar = scanner.nextLine();
        }

        System.out.println("\n--- Números Ingresados (Ordenados y Sin Duplicados) ---");
        if (numerosOrdenados.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            // Iterar sobre el TreeSet para mostrar los números ordenados
            for (Double num : numerosOrdenados) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
