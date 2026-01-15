package Unidad8.Act3SistemaVehiculos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String anio;
    
    public Vehiculo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public Vehiculo() {
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + this.marca +"\nModelo: " + this.modelo + "\n Año: " + this.anio);
    }

}
