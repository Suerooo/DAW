package Unidad9.Act6MetodoPago;

public class PayPal implements MetodoPago {
    private String email;

    public PayPal(String email) {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Error: campo email vacío");
            this.email = "desconocida";
        } else {
            this.email = email;
        }
    }

    @Override
    public String obtenerNombre() {
        return "PayPal";
    }

    @Override
    public void procesarPago(double importe) {
        if (!email.contains("@")) {
            System.out.println("Email invalido no contiene '@'");
        } else {
            System.out.printf("Pago procesado: %n Importe: %.2f%n Metodo: %s%n", importe, obtenerNombre());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        PayPal other = (PayPal) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return " Email: " + email;
    }

}
