package Unidad8.Act8Jerarquia;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Directivo: " + super.getNombre();
    }
}
