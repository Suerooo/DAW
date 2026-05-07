package Unidad11.Act18Surfero;

import java.io.Serializable;

public class Surfero implements Serializable {
    private final String DNI;
    private String nombre;
    private String playaFav;
    private Integer nivel;

    public Surfero(String dni, String nombre, String playaFav, Integer nivel) {
        this.DNI = dni;
        setNombre(nombre);
        setPlayaFav(playaFav);
        setNivel(nivel);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlayaFav() {
        return playaFav;
    }

    public void setPlayaFav(String playaFav) {
        this.playaFav = playaFav;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Surfero other = (Surfero) obj;
        return this.getDNI().equalsIgnoreCase(other.getDNI());
    }

    @Override
    public String toString() {
        return String.format("DNI: %s - Nombre: %s - Playa favorita: %s - Nivel %d", this.DNI, this.nombre,
                this.playaFav, this.nivel);
    }

}
