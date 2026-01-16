package Unidad8.Act5Computers;

public class Main {
    
public static void main(String[] args) {
    Portatil portatil1 = new Portatil("RAZER", 1800, 2);
    Sobremesa sobremesa1 = new Sobremesa("HP", 1400, "MICROATX");
    
    portatil1.decirEslogan();
    sobremesa1.decirEslogan();
    
    portatil1.rendimiento();
    sobremesa1.rendimiento();
    
    System.out.println(portatil1);
    System.out.println(sobremesa1);
    
    portatil1.setPeso(-200);
    portatil1.setPrecio(-200);
    portatil1.setTipo(null);
    
    sobremesa1.setDescripcion(null);
    sobremesa1.setPrecio(-5000);
    sobremesa1.setTipo(null);
    
    System.out.println(portatil1);
    System.out.println(sobremesa1);
}}
