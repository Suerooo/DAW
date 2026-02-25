package Unidad9.Act11ListaObject;

public class Futbolista implements Comparable<Futbolista> {
    private final int DNI;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(int dni, String nombre, int edad, int numeroGoles) {
        this.DNI = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    @Override
    public String toString() {
        return String.format("[Dni: %d | Nombre: %s | Edad: %d | Numero de goles: %d]",
                this.DNI, this.nombre, this.edad, this.numeroGoles);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + DNI;
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
        Futbolista other = (Futbolista) obj;
        if (DNI != other.DNI)
            return false;
        return true;
    }

    @Override
    public int compareTo(Futbolista o1) {
        return this.DNI - o1.DNI;
    }

    // @Override
    // public int compareTo(Object o) {
    // Futbolista o1 = (Futbolista) o;
    // return this.DNI - o1.DNI;
    // }

}
