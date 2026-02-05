package Unidad9.Act6MetodoPago;

public class Tarjeta implements MetodoPago {
    private String numeroTarjeta;
    private String titular;

    public Tarjeta(String numeroTarjeta, String titular) {
        setNumeroTarjeta(numeroTarjeta);
        setTitular(titular);
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        if (numeroTarjeta == null || numeroTarjeta.trim().isEmpty()) {
            System.out.println("Error: campo numero tarjeta vacío");
            this.numeroTarjeta = "desconocido";
        } else {
            this.numeroTarjeta = numeroTarjeta;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Error: campo titular vacío");
            this.titular = "desconocido";
        } else {
            this.titular = titular;
        }
    }

    @Override
    public String obtenerNombre() {
        return "Trajeta";
    }

    @Override
    public void procesarPago(double importe) {
        if (numeroTarjeta.length() != 16) {
            System.out.println("La tarjeta no tiene 16 carácteres no se puede porcesar el pago");
        } else {
            System.out.printf("Pago procesado: %n Importe: %.2f%n Metodo: %s%n", importe, obtenerNombre());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
        result = prime * result + ((titular == null) ? 0 : titular.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarjeta other = (Tarjeta) obj;
        if (numeroTarjeta == null) {
            if (other.numeroTarjeta != null)
                return false;
        } else if (!numeroTarjeta.equals(other.numeroTarjeta))
            return false;
        if (titular == null) {
            if (other.titular != null)
                return false;
        } else if (!titular.equals(other.titular))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format(" Numero de tarjeta: %s%n Titular: %s", numeroTarjeta, titular);
    }
}
