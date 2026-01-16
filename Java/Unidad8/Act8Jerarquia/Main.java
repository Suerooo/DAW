package Unidad8.Act8Jerarquia;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Directivo("Ana");
        Empleado e2 = new Oficial("Luis");
        Empleado e3 = new Tecnico("Marta");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
