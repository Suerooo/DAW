package Unidad7.Act2CuentaCorrienteSobrecarga;

public class Gestor {
    public String nombre;
    private final int numero;
    protected double importeMaximo;

    public Gestor(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.importeMaximo = 10000;
    }

    public Gestor(String nombre, int numero, double importeMaximo) {
        this.nombre = nombre;
        this.numero = numero;
        this.importeMaximo = importeMaximo;
    }

    public int getNumero() {
        return numero;
    }
}
