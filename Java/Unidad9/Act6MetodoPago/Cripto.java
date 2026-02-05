package Unidad9.Act6MetodoPago;

import java.util.Random;

public class Cripto implements MetodoPago {
    private String direccionWallet;

    public Cripto(String direccionWallet) {
        setDireccionWallet(direccionWallet);
    }

    public String getDireccionWallet() {
        return direccionWallet;
    }

    public void setDireccionWallet(String direccionWallet) {
        if (direccionWallet == null || direccionWallet.trim().isEmpty()) {
            System.out.println("Error: campo direccionWallet vacío");
            this.direccionWallet = "desconocida";
        } else {
            this.direccionWallet = direccionWallet;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((direccionWallet == null) ? 0 : direccionWallet.hashCode());
        return result;
    }

    @Override
    public String obtenerNombre() {
        return "Cripto";
    }

    @Override
    public void procesarPago(double importe) {
        Random hash = new Random();
        System.out.printf("Pago procesado: %n Importe: %.2f%n Metodo: %s%n Hash: %d%n", importe, obtenerNombre(),
                hash.nextInt());

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cripto other = (Cripto) obj;
        if (direccionWallet == null) {
            if (other.direccionWallet != null)
                return false;
        } else if (!direccionWallet.equals(other.direccionWallet))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Direccion wallet: " + direccionWallet;
    }

}
