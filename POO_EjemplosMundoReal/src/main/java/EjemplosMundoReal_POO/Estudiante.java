/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO; // Este es el paquete donde debe estar tu clase

/**
 * Clase Estudiante que representa a un estudiante de la UEA.
 * Es una clase HIJA que HEREDA de MiembroUEA.
 * Demuestra HERENCIA.
 */
public class Estudiante extends MiembroUEA { // 'extends MiembroUEA' para heredar de la clase padre

    // Atributos ESPECÍFICOS de un Estudiante (solo los estudiantes los tienen)
    private String carrera;
    private int nivel; // Nivel o semestre
    private double promedioAcademico;

    /**
     * Constructor para crear un nuevo Estudiante.
     * @param nombre Nombre del estudiante (viene del padre).
     * @param cedula Cédula (viene del padre).
     * @param correoUEA Correo (viene del padre).
     * @param carrera La carrera que está estudiando.
     * @param nivel El nivel actual ( 1, 2, 3...).
     * @param promedioAcademico Promedio de calificaciones.
     */
    public Estudiante(String nombre, String cedula, String correoUEA, String carrera, int nivel, double promedioAcademico) {
        super(nombre, cedula, correoUEA); // Llama al constructor de la clase padre (MiembroUEA)
        // Luego, inicializa los atributos específicos de Estudiante
        this.carrera = carrera;
        this.nivel = nivel;
        this.promedioAcademico = promedioAcademico;
    }

    // Métodos 'get' (obtener) para los atributos específicos del Estudiante.
    public String getCarrera() {
        return carrera;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    // Método específico del Estudiante
    /**
     * Simula la acción de inscribir una asignatura.
     * @param asignatura El nombre de la asignatura.
     */
    public void inscribirAsignatura(String asignatura) {
        System.out.println(getNombre() + " se ha inscrito en la asignatura: " + asignatura);
    }

    /**
     * Implementación del método 'mostrarDetalles()' de la clase padre (MiembroUEA).
     * ESTA ES LA VERSIÓN DE ESTUDIANTE. Demuestra POLIMORFISMO.
     */
    @Override // Esta palabra indica que estamos sobrescribiendo un método del padre
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Estudiante ---");
        System.out.println("Nombre: " + getNombre()); // Heredado de MiembroUEA
        System.out.println("Cédula: " + getCedula()); // Heredado
        System.out.println("Correo UEA: " + getCorreoUEA()); // Heredado
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel/Semestre: " + nivel);
        System.out.println("Promedio Académico: " + promedioAcademico);
        System.out.println("--------------------------------");
    }

    /**
     * Sobrescribe el método 'obtenerRol()' para que sea más específico para un Estudiante.
     */
    @Override
    public String obtenerRol() {
        return "Estudiante de la UEA de " + carrera;
    }
}