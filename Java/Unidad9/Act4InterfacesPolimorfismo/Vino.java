package Unidad9.Act4InterfacesPolimorfismo;

public class Vino implements ConDescuento, EsLiquido {
    private String marca;
    private String tipoVino;
    private int gradosAlchol;
    private double precio;
    private double descuento;
    private double volumen;
    private String tipoEnvase;

    public Vino(String marca, String tipoVino, int gradosAlchol, double precio, double descuento, double volumen,
            String tipoEnvase) {
        setMarca(marca);
        setTipoVino(tipoVino);
        setGradosAlchol(gradosAlchol);
        setPrecio(precio);
        setDescuento(descuento);
        setVolumen(volumen);
        setTipoEnvase(tipoEnvase);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("Error marca vacia");
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
            System.out.println("Error el precio no puede ser menor que 0");
            this.precio = 5;
        } else {
            this.precio = precio;
        }
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        if (tipoVino == null || tipoVino.trim().isEmpty()) {
            System.out.println("Error tipo de vino vacio");
            this.tipoVino = "desconocido";
        } else {
            this.tipoVino = tipoVino;
        }
    }

    public int getGradosAlchol() {
        return gradosAlchol;
    }

    public void setGradosAlchol(int gradosAlchol) {
        if (gradosAlchol < 0) {
            System.out.println("Error grados de alchol no puede ser menor que 0");
            this.gradosAlchol = 20;
        } else {
            this.gradosAlchol = gradosAlchol;
        }
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * (descuento / 100));
    }

    @Override
    public void setDescuento(double des) {
        if (descuento < 0) {
            System.out.println("Error descuento no puede ser menor que 0");
            this.descuento = 0;
        } else {
            this.descuento = des;
        }
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        if (env == null || env.trim().isEmpty()) {
            System.out.println("Error no ha introducido nada");
            this.tipoEnvase = "desconocido";
        } else {
            this.tipoEnvase = env;
        }
    }

    @Override
    public void setVolumen(double v) {
        if (v <= 0) {
            System.out.println("Error volumen no puede ser ni 0 ni menor");
            this.volumen = 1;
        } else {
            this.volumen = v;
        }
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", tipoVino=" + tipoVino + ", gradosAlchol=" + gradosAlchol + ", precio="
                + precio + ", descuento=" + descuento + ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase;
    }

}
