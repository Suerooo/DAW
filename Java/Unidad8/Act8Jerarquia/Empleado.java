package Unidad8.Act8Jerarquia;

public abstract class Empleado {
    private String nombre;

    protected Empleado(String nombre) {
        setNombre(nombre);
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

    @Override
    public abstract String toString();
}
