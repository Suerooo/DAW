package Unidad8.Act8Jerarquia;

public abstract class Operario extends Empleado {
    
    protected Operario(String nombre) {
        super(nombre);
    }

    @Override
    public abstract String toString();
}
