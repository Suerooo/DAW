package Examenes.Examen5.Act0Examen.Contenido;

public class Serie extends Contenido {

    private int temporadas;

    public Serie(String titulo, int calificacion, int temporadas) {
        super(titulo, calificacion);
        setTemporadas(temporadas);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas <= 0) {
            throw new IllegalArgumentException(
                    "El campo 'temporadas' no puede ser menor o igual a 0. Valor recibido: " + temporadas);
        }
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString() + "| Temporadas: " + temporadas + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && this.temporadas == ((Serie) obj).temporadas;
    }

}
