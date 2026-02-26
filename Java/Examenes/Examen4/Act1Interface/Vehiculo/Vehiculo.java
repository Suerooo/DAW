package Examenes.Examen4.Act1Interface.Vehiculo;

public interface Vehiculo {
    public void acelerar(Double velocidad);

    public void frenar();

    public Double getVelocidadActual();

    default void detener() {
        System.out.println("El vehiculo se ha detenido");
    }
}
