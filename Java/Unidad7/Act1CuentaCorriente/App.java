package Unidad7.Act1CuentaCorriente;

public class App {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.dni = "49399328C";
        cuenta1.nombre = "Raul";
        cuenta1.saldo = 0.0;

        cuenta1.saldo = cuenta1.ingresarDinero(1000);

        cuenta1.saldo = cuenta1.sacarDinero(500);
        
        cuenta1.mostrarInformacion();
    }
}
