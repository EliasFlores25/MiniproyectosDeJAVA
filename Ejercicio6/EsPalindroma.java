
// Crear un programa que muestre si la palabra ingresada por el usuario es palíndroma o no.

import java.util.Scanner;

public class EsPalindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabraOriginal = scanner.nextLine();

        // Normalizar la palabra: convertir a minúsculas y quitar espacios si los hubiera
        String palabraLimpia = palabraOriginal.toLowerCase().replace(" ", "");

        boolean esPalindroma = true;
        int longitud = palabraLimpia.length();

        // Comparar caracteres desde el inicio y desde el final
        for (int i = 0; i < longitud / 2; i++) {
            if (palabraLimpia.charAt(i) != palabraLimpia.charAt(longitud - 1 - i)) {
                esPalindroma = false;
                break; // No es palíndroma, salimos del bucle
            }
        }

        if (esPalindroma) {
            System.out.println("La palabra '" + palabraOriginal + "' es palíndroma.");
        } else {
            System.out.println("La palabra '" + palabraOriginal + "' NO es palíndroma.");
        }

        scanner.close();
    }
}