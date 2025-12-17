package Unidad7.Act3ClasePerro;

public class App {
	public static void main(String[] args) {
		Perro perro1 = new Perro();
		Perro perro2 = new Perro("Paco", "Chihuahua");
		Perro perro3 = new Perro("Pedro", "Chihuahua", 9, "Negro");

		perro1.mostrarInfo();
		perro2.mostrarInfo();
		perro3.mostrarInfo();

		perro2.comer();

		perro1.ladrar();
	}
}
