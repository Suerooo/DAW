package Unidad7.Act5GetSetNombreDeBanco;

class CuentaCorriente {
    private String nombre;
    private String dni;
    private double saldo;
    private static String nombreDeBanco;

    CuentaCorriente(String nombre, String dni) {
        this(nombre, dni, 0.0);
    }

    CuentaCorriente(String dni, double saldo) {
        this(null, dni, saldo);
    }

    CuentaCorriente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    void sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println(this.nombre + " no dispone de tanto dinero (Dinero faltante: " + (cantidad - this.saldo) + ")");
        } else {
            this.saldo -= cantidad;
            System.out.println(this.nombre + " ha retirado " + cantidad);
        }
    }

    void ingresarDinero(double cantidad) {
        this.saldo += cantidad;
        System.out.println(this.nombre + " ha ingresado " + cantidad);
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " | DNI: " + this.dni + " | Saldo: " + this.saldo);
        System.out.println();
    }

    public static String getNombreDeBanco() {
        return nombreDeBanco;
    }

    public static void setNombreDeBanco(String nombreDeBanco) {
        CuentaCorriente.nombreDeBanco = nombreDeBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}