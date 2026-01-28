package Examenes.Examen3.Empleado;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private double salario;
    private static int numDeEmpleados;

    protected Empleado(String dni, String nombre, int edad, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        numDeEmpleados++;
    }

    protected Empleado(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = 0;
    }

    protected double calcularSalarioAnual() {
        return this.salario * 12;
    }

    protected void aumentarSalario(double porcentaje) {
        this.salario *= (porcentaje / 100);
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
        return this.dni == other.dni && this.edad == other.edad && this.nombre == other.nombre
                && this.salario == other.salario;
    }

    @Override
    public String toString() {
        return "dni= " + dni + ", nombre= " + nombre + ", edad= " + edad + ", salario= " + salario;
    }

    public static int getNumDeEmpleados() {
        return numDeEmpleados;
    }
}
