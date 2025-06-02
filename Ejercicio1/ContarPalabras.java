// Desarrollar un programa que muestre la cantidad de palabras que contiene una frase.


import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Eliminar espacios al inicio y al final de la frase
        frase = frase.trim();

        // Si la frase está vacía después de trim, no hay palabras
        if (frase.isEmpty()) {
            System.out.println("La frase no contiene palabras.");
        } else {
            // Dividir la frase en palabras usando uno o más espacios como delimitador
            // \\s+ significa uno o más espacios en blanco
            String[] palabras = frase.split("\\s+");
            System.out.println("La frase contiene " + palabras.length + " palabra(s).");
        }

        scanner.close();
    }
    
}