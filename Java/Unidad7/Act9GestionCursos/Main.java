package Unidad7.Act9GestionCursos;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("daw1", "1", 10);
        Curso curso2 = new Curso("daw2", "2", 2);

        Estudiante estudiante1 = new Estudiante("Pepe", 20, 2);
        Estudiante estudiante2 = new Estudiante("Juan", 30, 20);

        curso1.agregarEstudiante(estudiante2);
        curso1.agregarEstudiante(estudiante1);

        curso2.agregarEstudiante(estudiante2);
        curso2.agregarEstudiante(estudiante1);
        curso2.agregarEstudiante(estudiante1);

        System.out.println(curso1);
        System.out.println(curso2);

    }
}
