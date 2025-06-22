/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO;

/**
 * @author USER
 * Clase Docente: Representa a un docente de la UEA.
 * Es una clase HIJA que HEREDA de MiembroUEA.
 * Demuestra HERENCIA.
 */
public class Docente extends MiembroUEA { // 'extends MiembroUEA' para heredar de la clase padre

    // Atributos ESPECÍFICOS de un Docente (solo los docentes los tienen)
    private String departamento;
    private String tituloAcademico; // Ej: PhD, MSc, Ing.
    private String[] asignaturasDictadas; // Un arreglo (lista) de asignaturas que imparte

    /**
     * Constructor para crear un nuevo Docente.
     * @param nombre Nombre del docente (viene del padre).
     * @param cedula Cédula (viene del padre).
     * @param correoUEA Correo (viene del padre).
     * @param departamento Departamento al que pertenece.
     * @param tituloAcademico Título profesional más alto.
     * @param asignaturasDictadas Un listado de asignaturas que da.
     */
    public Docente(String nombre, String cedula, String correoUEA, String departamento, String tituloAcademico, String[] asignaturasDictadas) {
        super(nombre, cedula, correoUEA); // Llama al constructor de la clase padre (MiembroUEA)
        // Luego, inicializa los atributos específicos de Docente
        this.departamento = departamento;
        this.tituloAcademico = tituloAcademico;
        this.asignaturasDictadas = asignaturasDictadas;
    }

    // Métodos 'get' (obtener) para los atributos específicos del Docente.
    public String getDepartamento() {
        return departamento;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public String[] getAsignaturasDictadas() {
        return asignaturasDictadas;
    }

    // Método específico del Docente
    /**
     * Simula la acción de asignar una calificación a un estudiante.
     * @param estudiante El nombre del estudiante.
     * @param asignatura La asignatura.
     * @param calificacion La calificación.
     */
    public void asignarCalificacion(String estudiante, String asignatura, double calificacion) {
        System.out.println(getNombre() + " (Docente) ha asignado " + calificacion + " en " + asignatura + " a " + estudiante);
    }

    /**
     * Implementación del método 'mostrarDetalles()' de la clase padre (MiembroUEA).
     * ESTA ES LA VERSIÓN DE DOCENTE. Demuestra POLIMORFISMO.
     */
    @Override // Esta palabra indica que estamos sobrescribiendo un método del padre
    public void mostrarDetalles() {
        System.out.println("--- Detalles del Docente ---");
        System.out.println("Nombre: " + getNombre()); // Heredado
        System.out.println("Cédula: " + getCedula()); // Heredado
        System.out.println("Correo UEA: " + getCorreoUEA()); // Heredado
        System.out.println("Departamento: " + departamento);
        System.out.println("Título: " + tituloAcademico);
        System.out.print("Asignaturas que imparte: ");
        for (String asig : asignaturasDictadas) { // Recorre el arreglo de asignaturas
            System.out.print(asig + " | ");
        }
        System.out.println("\n--------------------------------");
    }

    /**
     * Sobrescribe el método 'obtenerRol()' para que sea más específico para un Docente.
     */
    @Override
    public String obtenerRol() {
        return "Docente de la UEA del departamento de " + departamento;
    }
}