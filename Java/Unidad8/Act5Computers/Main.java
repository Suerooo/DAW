package Unidad8.Act5Computers;

public class Main {

    public static void main(String[] args) {
        Portatil portatil1 = new Portatil(112, 1800, 2);
        Sobremesa sobremesa1 = new Sobremesa(113, 1400, Tipos.MICROATX);
        Portatil portatil2 = new Portatil(112, 1800, 2);
        Sobremesa sobremesa2 = new Sobremesa(113, 1400, Tipos.MICROATX);

        System.out.println("Son iguales portatil: " + portatil1.equals(portatil2));
        System.out.println("Son iguales sobremesa: " + sobremesa1.equals(sobremesa2));

        portatil1.decirEslogan();
        sobremesa1.decirEslogan();

        portatil1.rendimiento();
        sobremesa1.rendimiento();

        System.out.println(portatil1);
        System.out.println(sobremesa1);

        portatil1.setPeso(-200);
        portatil1.setPrecio(-200);
        portatil1.setCodigo(2);

        sobremesa1.setTipo(null);
        sobremesa1.setPrecio(-5000);
        sobremesa1.setCodigo(-2);

        System.out.println(portatil1);
        System.out.println(sobremesa1);

        System.out.println("Son iguales portatil: " + portatil1.equals(portatil2));
        System.out.println("Son iguales sobremesa: " + sobremesa1.equals(sobremesa2));
    }
}
