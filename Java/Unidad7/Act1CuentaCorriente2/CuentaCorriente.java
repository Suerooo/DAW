package Unidad7.Act1CuentaCorriente2;

class CuentaCorriente {
    String nombre;
    String dni;
    Double saldo;

    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0.0;
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
}