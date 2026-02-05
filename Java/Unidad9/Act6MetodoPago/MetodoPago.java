package Unidad9.Act6MetodoPago;

public interface MetodoPago {
    void procesarPago(double importe);

    String obtenerNombre();

    default String mostrarSaludo() {
        return "Bienvenido al sistema de pago seguro";
    }
}
