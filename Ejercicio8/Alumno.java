
/*Crear una clase entidad llamada Alumno con las propiedades: 
Código, Nombre y Carnet. Encapsule las propiedades y agregue los constructores. A partir de esta entidad, 
crear una lista genérica de tipo ArrayList, insertar valores y luego mostrarlos en pantalla. 
 */

// Alumno.java
public class Alumno {
    // Propiedades encapsuladas (privadas)
    private String codigo;
    private String nombre;
    private String carnet;

    // Constructor vacío (por defecto)
    public Alumno() {
    }

    // Constructor con todos los parámetros
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Métodos Getters (para obtener los valores de las propiedades)
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    // Métodos Setters (para modificar los valores de las propiedades)
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    // Opcional: Sobrescribir toString() para una mejor representación del objeto
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}