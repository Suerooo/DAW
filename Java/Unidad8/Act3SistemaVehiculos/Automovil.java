package Unidad8.Act3SistemaVehiculos;

public class Automovil extends Vehiculo {
    private int puertas;
    
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca +"\nModelo: " + this.modelo + "\n Año: " + this.anio + "\n Puertas: " + this.puertas);
    }
}
