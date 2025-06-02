
// Desarrollar un programa que elimine la última palabra de una frase.

import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Eliminar espacios al inicio y al final de la frase
        frase = frase.trim();

        if (frase.isEmpty()) {
            System.out.println("La frase está vacía, no hay palabras para eliminar.");
        } else {
            // Encontrar el índice de la última ocurrencia de un espacio
            int ultimoEspacioIndex = frase.lastIndexOf(" ");

            if (ultimoEspacioIndex == -1) {
                // Si no hay espacios, significa que solo hay una palabra en la frase
                System.out.println("La frase solo contenía una palabra. Ahora está vacía.");
                frase = ""; // La frase queda vacía
            } else {
                // Obtener la subcadena desde el inicio hasta el último espacio
                frase = frase.substring(0, ultimoEspacioIndex);
                System.out.println("Frase sin la última palabra: " + frase);
            }
        }

        scanner.close();
    }
}