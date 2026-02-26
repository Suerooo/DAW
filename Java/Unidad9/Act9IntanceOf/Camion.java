package Unidad9.Act9IntanceOf;

public class Camion extends Vehiculo {
    private double carga;

    public Camion(String matricula, String modelo, double carga) {
        super(matricula, modelo);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga: " + carga + "kg";
    }
}