package Unidad7.Act1CuentaCorriente2;

public class App {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Raul", "sadsadsa2");
        CuentaCorriente cuenta2 = new CuentaCorriente("Pedro", "dsfdsf2");
        CuentaCorriente cuenta3 = new CuentaCorriente("Juan", "dsadsa32");

        cuenta1.ingresarDinero(1000);
        cuenta1.sacarDinero(500);

        cuenta3.sacarDinero(20000);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();
    }
}
