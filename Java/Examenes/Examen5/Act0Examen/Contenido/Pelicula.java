package Examenes.Examen5.Act0Examen.Contenido;

public class Pelicula extends Contenido {

    private int duracion;

    public Pelicula(String titulo, int calificacion, int duracion) {
        super(titulo, calificacion);
        setDuracion(duracion);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException(
                    "El campo 'duracion' no puede ser menor o igual a 0. Valor recibido: " + duracion);
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "| Duracion: " + duracion + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.duracion == ((Pelicula) obj).duracion;
    }

}
