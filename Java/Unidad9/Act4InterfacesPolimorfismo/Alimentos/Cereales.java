package Unidad9.Act4InterfacesPolimorfismo.Alimentos;

import java.time.LocalDate;

import Unidad9.Act4InterfacesPolimorfismo.Enum.TipoCereal;
import Unidad9.Act4InterfacesPolimorfismo.Interfaces.EsAlimento;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private TipoCereal tipoCereal;
    private int calorias;
    private LocalDate caducidad;

    public Cereales(String marca, double precio, TipoCereal tipoCereal, LocalDate caducidad) {
        setMarca(marca);
        setPrecio(precio);
        setTipoCereal(tipoCereal);
        setCalorias();
        setCaducidad(caducidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("Error: campo marca vacío");
            this.marca = "desconocida";
        } else {
            this.marca = marca;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Error: precio no puede ser menor que 0");
            this.precio = 5;
        } else {
            this.precio = precio;
        }
    }

    public TipoCereal getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(TipoCereal tipoCereal) {
        if (tipoCereal == null) {
            System.out.println("Error: campo tipo de cereal vacío");
            this.tipoCereal = TipoCereal.OTROS;
        } else {
            this.tipoCereal = tipoCereal;
        }
    }

    public int getCalorias() {
        return calorias;
    }

    private int setCalorias() {
        switch (this.tipoCereal) {
            case TipoCereal.ESPELTA -> {
                this.calorias = 5;
                return 5;
            }
            case TipoCereal.MAIZ -> {
                this.calorias = 8;
                return 8;
            }
            case TipoCereal.TRIGO -> {
                this.calorias = 12;
                return 12;
            }
            case TipoCereal.OTROS -> {
                this.calorias = 15;
                return 15;
            }
            default -> {
                System.out.println("Tipo de cereal no esperado. calorias = " + 15);
                this.calorias = 15;
                return 15;
            }
        }
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public void setCalorias(int calorias) {
        System.out.println("No se puede usar este metodo con cereales");
        System.out.printf("Para cereales de tipo %s las calorias son %d", this.tipoCereal, this.calorias);
    }

}
