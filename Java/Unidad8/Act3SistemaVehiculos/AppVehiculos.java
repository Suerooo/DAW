package Unidad8.Act3SistemaVehiculos;

public class AppVehiculos {
    public static void main(String[] args) {
        Automovil coche1 = new Automovil();
        Automovil coche2 = new Automovil();
        Automovil motocicleta1 = new Motocicleta();
        
        Vehiculo[] vehiculos = {coche1, motocicleta1, coche2};
        
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].mostrarInfo();
        }
    }
}
