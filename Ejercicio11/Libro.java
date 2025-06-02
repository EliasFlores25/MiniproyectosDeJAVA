
/*Desarrollar un programa que permita almacenar 
múltiples elementos de la clase Libro (Id, Título, Edición, Autor) en un LinkedHashSet. */


import java.util.Objects; // Necesario para Objects.hash y Objects.equals

public class Libro {
    // Propiedades encapsuladas
    private String id;
    private String titulo;
    private String edicion;
    private String autor;

    // Constructor completo
    public Libro(String id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    // Getters para acceder a las propiedades
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

    // Setters (opcional, si los libros se van a modificar después de la creación)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Sobrescribir equals() y hashCode() para que LinkedHashSet identifique duplicados
    // Se considera que dos libros son "iguales" si tienen el mismo ID.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id); // Comparar por ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // Generar hash basado en el ID
    }

    // Opcional: Sobrescribir toString() para una mejor representación del objeto
    @Override
    public String toString() {
        return "ID: " + id + ", Título: '" + titulo + '\'' +
               ", Edición: '" + edicion + '\'' +
               ", Autor: '" + autor + '\'';
    }
}