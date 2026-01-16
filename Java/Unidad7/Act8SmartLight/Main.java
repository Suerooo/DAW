package Unidad7.Act8SmartLight;

public class Main {
    public static void main(String[] args) {
        Bombilla aux1 = new Bombilla("Salon", true, 0);

        System.out.println(aux1);

        aux1.setIntensidad(2000);
        System.out.println(aux1);

    }
}
