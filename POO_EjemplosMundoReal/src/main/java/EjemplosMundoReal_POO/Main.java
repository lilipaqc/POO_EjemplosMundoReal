/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemplosMundoReal_POO; // Asegúrate de que el paquete sea el correcto

import java.util.ArrayList; // Necesitamos ArrayList para demostrar polimorfismo
import java.util.List;     // Necesitamos List (interfaz para ArrayList)

/**
 * Clase Main: Punto de entrada del programa.
 * Aquí demostramos la creación de objetos y la interacción entre ellos,
 * usando los 4 pilares de la Programación Orientada a Objetos:
 * Encapsulamiento, Abstracción, Herencia y Polimorfismo.
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CAMBIO 1: Título principal
        System.out.println("--- Demostración de POO en ejemplos en situaciones del mundo real. ---");

        // 1. CREACIÓN DE OBJETOS (INSTANCIAS DE LAS CLASES HIJAS)
        // Se crean objetos 'Estudiante' y 'Docente' usando sus respectivos constructores.
        System.out.println("\n--- Creando Miembros de la UEA ---");

        Estudiante miEstudiante = new Estudiante(
                "Lilian Quijije",
                "1232123123",
                "lili.pao@uea.edu.ec",
                "Ingeniería de Tecnologías de la Información", // Tu carrera
                2, // nivel
                8.25 //promedio académico
        );

        Estudiante otroEstudiante = new Estudiante(
                "Ana García",
                "0912345678",
                "ana.garcía@uea.edu.ec",
                "Ingeniería de Tecnologías de la Información",
                4,
                9.90
        );

        // Información del docente
        String[] asignaturasDocenteSistemas = {"Programación Orientada a Objetos", "Bases de Datos I", "Redes de Computadoras"};
        Docente docenteSistemas = new Docente(
                "Ing. Juan Paz", // Nombre del docente (ejemplo)
                "1000123450", // Cédula del docente (ejemplo)
                "juan.paz@uea.edu.ec", // Correo del docente (ejemplo)
                "Ciencias de la Computación y Sistemas", // Departamento
                "Magíster en Sistemas de Información, mención cibereguridad",
                asignaturasDocenteSistemas
        );
        // Docente de otra carrera (ejemplo)
        String[] asignaturasDocenteAgronomia = {"Botánica General", "Fertilización de Suelos"};
        Docente docenteAgronomia = new Docente(
                "Dra. Sofía Rivas",
                "0698765432",
                "sofia.rivas@uea.edu.ec",
                "Ciencias Agropecuarias",
                "PhD en Agronomía",
                asignaturasDocenteAgronomia
        );


        // 2. DEMOSTRACIÓN DE ENCAPSULAMIENTO Y HERENCIA (a través de métodos 'get')
        System.out.println("\n--- Accediendo a información (Encapsulamiento y Herencia) ---");
        System.out.println("Nombre de mi Estudiante: " + miEstudiante.getNombre()); // getNombre heredado
        System.out.println("Carrera de mi Estudiante: " + miEstudiante.getCarrera()); // getCarrera específico
        System.out.println("Correo de Docente de Sistemas: " + docenteSistemas.getCorreoUEA());
        System.out.println("Departamento de Docente de Sistemas: " + docenteSistemas.getDepartamento());

        // 3. DEMOSTRACIÓN DE MÉTODOS ESPECÍFICOS Y HEREDADOS
        System.out.println("\n--- Realizando Acciones ---");
        // CAMBIO 2: Mensaje de inscripción más específico
        miEstudiante.inscribirAsignatura("Programación Orientada a Objetos"); // Ahora llama directamente a la asignatura del ejemplo
        docenteSistemas.asignarCalificacion("Ana Belén Solís", "Programación Orientada a Objetos", 8.8);

        // 4. DEMOSTRACIÓN DE POLIMORFISMO Y ABSTRACCIÓN
        // Podemos guardar objetos de Estudiante y Docente en una lista de su tipo base (MiembroUEA).
        // Esto es posible porque Estudiante y Docente "son un" MiembroUEA.
        System.out.println("\n--- Demostración de Polimorfismo ---");
        List<MiembroUEA> miembrosUEA = new ArrayList<>(); // Creamos una lista que puede guardar cualquier MiembroUEA
        miembrosUEA.add(miEstudiante);
        miembrosUEA.add(otroEstudiante);
        miembrosUEA.add(docenteSistemas);
        miembrosUEA.add(docenteAgronomia);

        // Iteramos sobre la lista de MiembroUEA.
        // Aunque la lista es de tipo 'MiembroUEA', Java sabe llamar al 'mostrarDetalles()'
        // y 'obtenerRol()' correcto para cada objeto (Estudiante o Docente).
        // Esto es el POLIMORFISMO en acción.
        for (MiembroUEA miembro : miembrosUEA) {
            miembro.mostrarDetalles(); // Llamada polimórfica: Java decide qué mostrar según el objeto real
            System.out.println("Rol en la UEA: " + miembro.obtenerRol()); // Llamada polimórfica
            System.out.println("--------------------------------\n");
        }

        System.out.println("--- Demostración Finalizada ---");
    }
}