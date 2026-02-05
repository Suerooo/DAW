package Unidad9.Act5Banco;

public class Main {
    public static void main(String[] args) {
        Persona aux = new Persona("39399328A", "Raúl", 24, 1200);

        System.out.println(aux);

        aux.setHorasTrabajadas(23);
        aux.setSaldo(2333);

        System.out.println(aux);

    }
}
