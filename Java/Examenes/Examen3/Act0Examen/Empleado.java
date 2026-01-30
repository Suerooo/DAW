package Examenes.Examen3.Act0Examen;

public abstract class Empleado {
    // VALORES DEFAULT
    protected static final String MENSAJE_ERROR = "el valor que a introducido es incorrecto. Valor establecido por defecto: ";
    private static final String NOMBRE_DEFAULT = "desconocido";
    private static final String DNI_DEFAULT = "desconocido";
    private static final int EDAD_DEFAULT = 18;
    private static final double SALARIO_DEFAULT = 1200;

    // ATRIBUTOS
    private String nombre;
    private String dni;
    private int edad;
    private double salarioBase;
    private static int numTrabajadores = 0;

    // METODOS
    protected Empleado(String nombre, String dni, int edad, double salarioBase) {
        setNombre(nombre);
        setDni(dni);
        setEdad(edad);
        setSalarioBase(salarioBase);
        numTrabajadores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("En nombre " + MENSAJE_ERROR + NOMBRE_DEFAULT);
            this.nombre = NOMBRE_DEFAULT;
        } else {
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            System.out.println("En dni " + MENSAJE_ERROR + DNI_DEFAULT);
            this.dni = DNI_DEFAULT;
        } else {
            this.dni = dni;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 16 || edad >= 100) {
            System.out.println("En edad " + MENSAJE_ERROR + EDAD_DEFAULT);
            this.edad = EDAD_DEFAULT;
        } else {
            this.edad = edad;
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 1000) {
            System.out.println("En salario base " + MENSAJE_ERROR + SALARIO_DEFAULT);
            this.salarioBase = SALARIO_DEFAULT;
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public static int getNumTrabajadores() {
        return numTrabajadores;
    }

    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return String.format("EMPLEADO %n Nombre: %s %n Dni: %s %n Edad %d", nombre, dni, edad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Empleado other = (Empleado) obj;

        return this.dni.equalsIgnoreCase(other.dni)
                && this.edad == other.edad
                && this.nombre.equalsIgnoreCase(other.nombre)
                && this.salarioBase == other.salarioBase;
    }

}
