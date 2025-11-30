package Examenes.Examen3.Alumnos;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String email;
    private int edad;
    private long telefono;

    // Constructor sin argumentos
    public Alumno() {
        this("", "", "", 0, 0L);
    }

    // Constructor nombre, apellidos y edad
    public Alumno(String nombre, String apellidos, int edad) {
        this(nombre, apellidos, "", edad, 0L);
    }

    // Constructor con todos los atributos
    public Alumno(String nombre, String apellidos, String email, int edad, long telefono) {
        this.nombre = Objects.requireNonNull(nombre, "nombre no puede ser null");
        this.apellidos = Objects.requireNonNull(apellidos, "apellidos no pueden ser null");
        this.email = email == null ? "" : email;
        setEdad(edad);
        setTelefono(telefono);
    }

    // Getters y setters con validación básica
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "nombre no puede ser null");
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = Objects.requireNonNull(apellidos, "apellidos no pueden ser null");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? "" : email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if (telefono < 0) {
            throw new IllegalArgumentException("telefono no puede ser negativo");
        }
        this.telefono = telefono;
    }

    // Indica si es mayor de edad (>= 18)
    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return edad == alumno.edad &&
                telefono == alumno.telefono &&
                nombre.equals(alumno.nombre) &&
                apellidos.equals(alumno.apellidos) &&
                Objects.equals(email, alumno.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, email, edad, telefono);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}