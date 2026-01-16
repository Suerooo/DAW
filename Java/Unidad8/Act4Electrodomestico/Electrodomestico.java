package Unidad8.Act4Electrodomestico;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;
    
    public Electrodomestico(String tipo, String marca, double potencia) {
        setTipo(tipo);
        setMarca(marca);
        setPotencia(potencia);
    }
    
    public void setTipo(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            this.tipo = "deconocido";
        } else {
            this.tipo = tipo;
        }
    }
    
    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            this.marca = "deconocido";
        } else {
            this.marca = marca;
        }
    }
    
    public void setPotencia(double potencia) {
        if (potencia <= 0) {
            this.potencia = 1.0;
        } else {
            this.potencia = potencia;
        }
    }
    
    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getPotencia() {
        return potencia;
    }
    @Override
    public String toString() {
        return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
    }
    
    public double getConsumo (int horas) {
        return this.potencia * horas;
    }
    
    public double getCosteConsumo (int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }
}
