package Unidad8.Act8Jerarquia;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Tecnico: " + super.getNombre();
    }
}
