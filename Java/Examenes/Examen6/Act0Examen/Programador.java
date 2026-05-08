package Examenes.Examen6.Act0Examen;

import java.io.Serializable;

public class Programador implements Serializable, Comparable<Programador> {
    private final Integer ID;
    private String nombre;
    private String lenguajeProg;
    private Double sueldo;

    public Programador(Integer id, String nombre, String lenguajeProg, Double sueldo) throws IllegalArgumentException {
        if (id < 0) {
            throw new IllegalArgumentException("ID no puede ser negativo. Valor recibido: " + id);
        }

        this.ID = id;
        setNombre(nombre);
        setLenguajeProg(lenguajeProg);
        setSueldo(sueldo);
    }

    // ==================================================
    // GETTERS/SETTERS
    // ==================================================

    public Integer getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre no puede ser nulo ni vacío");
        }

        this.nombre = nombre.trim();
    }

    public String getLenguajeProg() {
        return lenguajeProg;
    }

    public void setLenguajeProg(String lenguajeProg) {
        if (lenguajeProg == null || lenguajeProg.isBlank()) {
            throw new IllegalArgumentException("lenguajeProg no puede ser nulo ni vacío");
        }

        this.lenguajeProg = lenguajeProg.trim();
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        if (sueldo < 0) {
            throw new IllegalArgumentException("Sueldo no puede ser negativo. Valor recibido: " + sueldo);
        }

        this.sueldo = sueldo;
    }

    // ==================================================
    // OVERRIDE
    // ==================================================

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Programador other = (Programador) obj;
        return this.getID().equals(other.getID());
    }

    @Override
    public String toString() {
        return String.format("ID: %d - Nombre: %s - Lenguaje de programacion: %s - Sueldo: %.2f",
                this.ID, this.nombre, this.lenguajeProg, this.sueldo);
    }

    @Override
    public int compareTo(Programador o) {
        return this.ID.compareTo(o.ID);
    }

}
