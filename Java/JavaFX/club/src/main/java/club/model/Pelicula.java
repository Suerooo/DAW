package club.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Pelicula implements Serializable {
    private String titulo;
    private int anio;
    private double duracion;

    public Pelicula(String titulo, int anio, double duracion) {
        setTitulo(titulo);
        setAnio(anio);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("'titulo' no puede ser nulo o vacío");
        }

        this.titulo = titulo.trim();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        int anioActual = LocalDate.now().getYear();

        if (anio < 1895 || anio > anioActual) {
            throw new IllegalArgumentException(
                    String.format("'año' no puede ser menor que 1895 o mayor que %d.", anioActual));
        }

        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException(
                    "'duracion' no puede ser menor o igual a 0");
        }

        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s | Año: %d | Duracion: %.2f %n", titulo, anio, duracion);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

}
