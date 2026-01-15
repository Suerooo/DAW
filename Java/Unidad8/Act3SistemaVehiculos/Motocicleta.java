package Unidad8.Act3SistemaVehiculos;

public class Motocicleta extends Automovil {
    private String tipo;
    
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca +"\nModelo: " + this.modelo + "\n Año: " + this.anio + "\n Tipo: " + this.tipo);
    }
}
