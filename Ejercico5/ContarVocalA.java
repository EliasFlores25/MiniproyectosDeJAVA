
/*Desarrollar un programa que muestre la cantidad de veces 
que aparece la vocal "A" en una frase ingresada por la persona usuaria. */

import java.util.Scanner;

public class ContarVocalA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        int contadorA = 0;

        // Convertir la frase a minúsculas para contar tanto 'a' como 'A'
        String fraseMinisculas = frase.toLowerCase();

        for (int i = 0; i < fraseMinisculas.length(); i++) {
            if (fraseMinisculas.charAt(i) == 'a') {
                contadorA++;
            }
        }

        System.out.println("La vocal 'A' (o 'a') aparece " + contadorA + " veces en la frase.");

        scanner.close();
    }
}