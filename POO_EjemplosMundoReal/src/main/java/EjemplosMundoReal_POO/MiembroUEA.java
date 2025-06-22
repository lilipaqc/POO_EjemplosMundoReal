/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO;

/**
 * Clase MiembroUEA: Clase base ABSTRACTA para cualquier persona en la universidad.
 * Aquí definimos lo que todo miembro de la UEA tiene en común.
 * Demostramos ABSTRACCIÓN y ENCAPSULAMIENTO.
 * @author USER // 
 */
public abstract class MiembroUEA { // 'abstract' significa que NO podemos crear objetos directos de MiembroUEA
    // Atributos (características) comunes para todos los miembros de la UEA.
    // Son 'private' para protegerlos (ENCAPSULAMIENTO).
    private String nombre;
    private String cedula;
    private String correoUEA; // El correo institucional de la UEA

    /**
     * Constructor: Para crear un MiembroUEA.
     * Inicializa las características comunes.
     * @param nombre El nombre completo de la persona.
     * @param cedula El número de cédula.
     * @param correoUEA El correo electrónico de la universidad.
     */
    public MiembroUEA(String nombre, String cedula, String correoUEA) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoUEA = correoUEA;
    }

    // Métodos 'get' (obtener): Permite leer los atributos privados (parte del ENCAPSULAMIENTO).
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreoUEA() {
        return correoUEA;
    }

    // Método ABSTRACTO: Cada clase hija (Estudiante, Docente) Crea su propia versión.
    // Para el POLIMORFISMO.
    /**
     * Método abstracto para mostrar los detalles específicos de cada tipo de miembro.
     * Tanto Estudiantes como Docentes mostrarán su información de forma diferente.
     */
    public abstract void mostrarDetalles(); // Definición.

    // Método común (opcional, pero útil para POLIMORFISMO)
    /**
     * Método para obtener el rol general de este miembro en la UEA.
     * Sobrescrito por las clases hijas para un rol más específico.
     */
    public String obtenerRol() {
        return "Miembro de la UEA";
    }

    // Método toString: Imprime el objeto de forma sencilla.
    @Override // Indica que estamos sobrescribiendo un método de Java (de Object)
    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Correo: " + correoUEA;
    }
}