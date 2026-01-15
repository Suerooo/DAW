package Unidad8.Act3SistemaVehiculos;

public class Automovil extends Vehiculo {
    private int puertas;
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + this.puertas);
    }
}
