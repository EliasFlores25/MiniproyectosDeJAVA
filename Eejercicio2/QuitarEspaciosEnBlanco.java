//Crear un programa que lea una cadena y quite los espacios en blanco.

import java.util.Scanner;

public class QuitarEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadenaOriginal = scanner.nextLine();

        // Método 1: Usando replaceAll con expresión regular para cualquier tipo de espacio
        String cadenaSinEspacios = cadenaOriginal.replaceAll("\\s", "");
        // "\\s" representa cualquier carácter de espacio en blanco (espacio, tab, etc.)

        // Método 2: Usando replace para un espacio simple (si solo se quieren quitar espacios simples)
        // String cadenaSinEspacios = cadenaOriginal.replace(" ", "");

        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        scanner.close();
    }
}