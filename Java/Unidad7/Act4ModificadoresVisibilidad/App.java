package Unidad7.Act4ModificadoresVisibilidad;

public class App {
	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("Raul", "53252353A");
		CuentaCorriente cuenta2 = new CuentaCorriente("Pedro", "6546546A", 3232.23);
		CuentaCorriente cuenta3 = new CuentaCorriente("64364363A", 2322.23);

		cuenta1.ingresarDinero(1000);
		cuenta1.sacarDinero(500);
		cuenta1.mostrarInformacion();

		cuenta2.mostrarInformacion();

		cuenta3.ingresarDinero(500);
		cuenta3.sacarDinero(20000);
		cuenta3.mostrarInformacion();
	}
}
