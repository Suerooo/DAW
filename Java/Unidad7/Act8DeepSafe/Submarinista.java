package Unidad7.Act8DeepSafe;

public class Submarinista {
    public String nombre;
    private int oxigeno;
    private double profundidad;
    
    public Submarinista(String nombre, int oxigeno, double profundidad) {
        setNombre(nombre);
        setOxigeno(oxigeno);
        setProfundidad(profundidad);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            this.nombre = "desconocido";
        } else {
            this.nombre = nombre;
        }
    }
    public int getOxigeno() {
        return oxigeno;
    }
    public void setOxigeno(int oxigeno) {
        if (oxigeno < 0) {
            this.oxigeno = 0;
        } else if(oxigeno > 100) {
            this.oxigeno = 100;
        } else {
            this.oxigeno = oxigeno;
        }
        
        if(oxigeno < 20) {
            System.out.println("ALERTA NIVEL DE OXIGENO CRITICO");
        }
    }
    public double getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(double profundidad) {
        if (profundidad < 0) {
            this.profundidad = 0.0;
        } else {
            this.profundidad = profundidad;
        }
        
        if (profundidad > 40) {
            System.out.println("Limite de buceo recreativo alcanzado");
        }
    }
    public void sumergirse(double metros) {
        int oxigenoGastado = ((int) metros / 2);
        System.out.println("Se ha sumergido "+metros+" metros profundidad acutal: " + profundidad + " oxigeno gastado: " + oxigenoGastado + " oxigeno actual: "+oxigeno);
        setProfundidad(this.profundidad + metros);
        setOxigeno(oxigeno-oxigenoGastado);
    }

    @Override
    public String toString() {
        return "Submarinista [nombre=" + nombre + ", oxigeno=" + oxigeno + ", profundidad=" + profundidad + "]";
    }
    
}
