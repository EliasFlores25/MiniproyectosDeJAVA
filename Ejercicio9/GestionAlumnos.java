
/*Crear una lista de tipo LinkedList 
con la misma entidad que el ejercicio anterior. 
Insertar valores y mostrarlos en pantalla.*/

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear una lista genérica de tipo ArrayList para almacenar objetos Alumno
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        System.out.println("--- Gestión de Alumnos con ArrayList ---");

        // Insertar valores (crear objetos Alumno y añadirlos a la lista)
        // Alumno 1
        System.out.println("\nIngrese datos para el Alumno 1:");
        System.out.print("Código: ");
        String cod1 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nom1 = scanner.nextLine();
        System.out.print("Carnet: ");
        String car1 = scanner.nextLine();
        Alumno alumno1 = new Alumno(cod1, nom1, car1);
        listaAlumnos.add(alumno1);

        // Alumno 2
        System.out.println("\nIngrese datos para el Alumno 2:");
        System.out.print("Código: ");
        String cod2 = scanner.nextLine();
        System.out.print("Nombre: ");
        String nom2 = scanner.nextLine();
        System.out.print("Carnet: ");
        String car2 = scanner.nextLine();
        Alumno alumno2 = new Alumno(cod2, nom2, car2);
        listaAlumnos.add(alumno2);

        // Alumno 3 (ejemplo de creación directa sin input)
        Alumno alumno3 = new Alumno("C003", "Maria Elena", "ME987");
        listaAlumnos.add(alumno3);


        System.out.println("\n--- Alumnos Registrados (ArrayList) ---");
        // Mostrar los valores en pantalla (recorrer la lista)
        for (Alumno al : listaAlumnos) {
            System.out.println(al.toString()); // Usamos el método toString() de la clase Alumno
        }

        scanner.close();
    }
}