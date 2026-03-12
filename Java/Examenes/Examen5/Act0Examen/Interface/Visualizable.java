package Examenes.Examen5.Act0Examen.Interface;

public interface Visualizable {
    void marcarVisto();

    default void mostrarAviso() {
        System.out.println("Estas iniciando un contenido multimedia");
    }

}
