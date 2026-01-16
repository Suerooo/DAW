package Unidad7.Act9GestionCursos;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Curso(String nombreCurso, String codigo, int tamanioMaximo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.estudiantes = new Estudiante[tamanioMaximo];
        this.cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes >= estudiantes.length) {
            System.out.println("No se pueden añadir mas estudiantes se alcanzó el máximo");
        } else {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        }
    }

    @Override
    public String toString() {
        return "Clase [nombreCurso=" + nombreCurso + ", codigo=" + codigo + ", estudiantes="
                + Arrays.toString(estudiantes) + "]";
    }

}
