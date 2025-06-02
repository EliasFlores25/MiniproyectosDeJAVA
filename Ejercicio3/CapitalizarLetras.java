
/*Crear un programa que lea una cadena, 
sustituya por mayúscula la primera letra de la cadena
 y la primera letra después de un espacio. */
 
import java.util.Scanner;

public class CapitalizarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadenaOriginal = scanner.nextLine();

        // Convertir la cadena a un array de caracteres para fácil manipulación
        char[] caracteres = cadenaOriginal.toCharArray();

        boolean capitalizarSiguiente = true; // Bandera para la primera letra o después de un espacio

        for (int i = 0; i < caracteres.length; i++) {
            // Si el carácter actual es una letra y la bandera está activa
            if (Character.isLetter(caracteres[i]) && capitalizarSiguiente) {
                caracteres[i] = Character.toUpperCase(caracteres[i]);
                capitalizarSiguiente = false; // Desactivar la bandera hasta el siguiente espacio
            }
            // Si encontramos un espacio, activamos la bandera para capitalizar la siguiente letra
            else if (Character.isWhitespace(caracteres[i])) {
                capitalizarSiguiente = true;
            }
        }

        String cadenaModificada = new String(caracteres);
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena modificada: " + cadenaModificada);

        scanner.close();
    }
}