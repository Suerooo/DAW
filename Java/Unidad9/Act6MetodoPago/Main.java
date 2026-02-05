package Unidad9.Act6MetodoPago;

public class Main {
    public static void main(String[] args) {
        MetodoPago[] aux = new MetodoPago[3];
        aux[0] = new Tarjeta("1234567891234567", "rau");
        aux[1] = new PayPal("raulsuero@gmail.com");
        aux[2] = new Cripto("343634532344");

        for (MetodoPago metodoPago : aux) {
            metodoPago.mostrarSaludo();
            metodoPago.obtenerNombre();
            metodoPago.procesarPago(150.75);
        }
    }

}
