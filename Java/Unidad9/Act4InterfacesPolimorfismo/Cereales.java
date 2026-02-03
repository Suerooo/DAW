package Unidad9.Act4InterfacesPolimorfismo;

import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private int calorias;
    private LocalDate caducidad;
    
    public Cereales(String marca, double precio, String tipoCereal, int calorias, LocalDate caducidad) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.calorias = calorias;
        this.caducidad = caducidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }
    
    
    
}
