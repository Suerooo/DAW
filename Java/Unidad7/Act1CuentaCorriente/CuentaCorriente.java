package Unidad7.Act1CuentaCorriente;

class CuentaCorriente {
    String nombre;
    String dni;
    Double saldo;

    double sacarDinero(double retirar) {
        if (retirar > saldo) {
            System.out.println("No dispone de tanto dinero");
            return saldo;
        } else {
            System.out.println("Dinero retirado");
            return saldo-retirar;
        }
    }

    double ingresarDinero(double ingresar) {
        return saldo+ingresar;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " dni: " + dni + " saldo: " + saldo);
    }
}