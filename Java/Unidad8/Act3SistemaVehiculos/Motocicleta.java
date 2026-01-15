package Unidad8.Act3SistemaVehiculos;

public class Motocicleta extends Automovil {
    private String tipo;
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + this.tipo);
    }
}
