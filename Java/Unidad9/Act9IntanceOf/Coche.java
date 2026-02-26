package Unidad9.Act9IntanceOf;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String matricula, String modelo, int puertas) {
        super(matricula, modelo);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Puertas: " + puertas;
    }

    public int getPuertas() {
        return puertas;
    }
}