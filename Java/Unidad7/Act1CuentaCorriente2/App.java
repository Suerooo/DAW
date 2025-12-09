package Unidad7.Act1CuentaCorriente2;

public class App {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("123432A", "Raul");
        CuentaCorriente cuenta2 = new CuentaCorriente("5435435A", "Pedro");
        CuentaCorriente cuenta3 = new CuentaCorriente("4643643A", "Juan");

        cuenta1.saldo = cuenta1.ingresarDinero(1000);

        cuenta1.saldo = cuenta1.sacarDinero(500);
        
        cuenta1.mostrarInformacion();
    }
}
