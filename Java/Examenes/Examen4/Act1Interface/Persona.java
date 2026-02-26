package Examenes.Examen4.Act1Interface;

public abstract class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    protected Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'nombre' no puede ser nulo o vacío");
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("El campo 'edad' no puede ser negativo o 0. Valor recibido: " + edad);
        }
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
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
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Edad: %d", nombre, edad);
    }

    @Override
    public int compareTo(Persona o) {
        return this.edad - o.edad;
    }

}
