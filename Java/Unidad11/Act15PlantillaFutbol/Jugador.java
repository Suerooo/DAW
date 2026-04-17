package Unidad11.Act15PlantillaFutbol;

import java.io.Serializable;

public class Jugador implements Comparable<Jugador>, Serializable {
    private final String DNI;
    private String nombre;
    private PosicionCampo posicionCampo;

    public Jugador(String dni, String nombre, PosicionCampo posicionCampo) {
        this.DNI = dni;
        setNombre(nombre);
        setPosicionCampo(posicionCampo);
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

    public PosicionCampo getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(PosicionCampo posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
        Jugador other = (Jugador) obj;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Dni: %s - Nombre: %s - Posicion Campo: %s%n", this.DNI, this.nombre, this.posicionCampo);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareTo(o.nombre);
    }

}
