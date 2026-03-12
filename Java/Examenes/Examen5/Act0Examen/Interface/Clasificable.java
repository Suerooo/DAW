package Examenes.Examen5.Act0Examen.Interface;

public interface Clasificable extends Visualizable {
    double getCalificacion();

    default boolean esTopVentas() {
        if (this.getCalificacion() >= 9) {
            return true;
        }

        return false;
    }

}
