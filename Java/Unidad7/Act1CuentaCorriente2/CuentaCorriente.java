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

    void sacarDinero(double retirar) {
        if (retirar > saldo) {
            System.out.println(this.nombre + " usted no dispone de tanto dinero");
        } else {
            System.out.println(this.nombre + " Dinero retirado");
            this.saldo -= retirar;
        }
    }

    void ingresarDinero(double ingresar) {
        this.saldo += ingresar;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " dni: " + this.dni + " saldo: " + this.saldo);
    }
}