package Examenes.Examen5.Act0Examen.Contenido;

import Interface.Clasificable;

public abstract class Contenido implements Clasificable, Comparable<Contenido> {
    private String titulo;
    private double calificacion;
    private boolean visto;

    protected Contenido(String titulo, int calificacion) {
        setTitulo(titulo);
        setCalificacion(calificacion);
        setVisto(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'titulo' no puede ser nulo o vacio");
        }
        this.titulo = titulo.trim();
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException(
                    "El campo 'calificacion' tiene estar entre 0 y 10. Valor recibido: " + calificacion);
        }
        this.calificacion = calificacion;
    }

    @Override
    public void marcarVisto() {
        setVisto(true);

    }

    @Override
    public int compareTo(Contenido o) {
        return this.titulo.compareTo(o.titulo);
    }

    // Implementacion sin usar generic<> (Borrar '<Contenido>' de la linea 5 para usarlo)

    // @Override
    // public int compareTo(Object o) {
    // return this.titulo.compareTo(((Contenido) o).titulo);
    // }

    @Override
    public String toString() {
        return String.format("Titulo: %s | Calificacion: %.2f | Visto: %s ",
                this.titulo, this.calificacion, this.visto);
    }

    @Override
    public boolean equals(Object obj) {
        Contenido other = (Contenido) obj;
        return this.titulo.equalsIgnoreCase(other.titulo)
                && this.calificacion == other.calificacion
                && this.visto == other.visto;
    }

}
