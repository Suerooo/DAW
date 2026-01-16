package Unidad7.Act8SmartLight;

public class Bombilla {
    public String nombre;
    private boolean encendida;
    private int intensidad;

    public Bombilla(String nombre, boolean encendida, int intensidad) {
        setNombre(nombre);
        setEncendida(encendida);
        setIntensidad(intensidad);
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

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        if (intensidad < 0) {
            this.intensidad = 0;
        } else if (intensidad > 100) {
            this.intensidad = 100;
        } else {
            this.intensidad = intensidad;
        }

        if (intensidad == 0) {
            setEncendida(false);
        } else {
            setEncendida(true);
        }
    }

    @Override
    public String toString() {
        return "Bombilla [nombre=" + nombre + ", encendida=" + encendida + ", intensidad=" + intensidad + "]";
    }

}
