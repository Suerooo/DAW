package Unidad8.Act6Instrumento;

public class Main {
    public static void main(String[] args) {
        Campana aux1 = new Campana();
        Piano aux2 = new Piano();
        
        aux1.add(Notas.DO);
        aux1.add(Notas.DO);
        aux1.add(Notas.RE);
        aux1.add(Notas.SI);
        aux1.interpretar();
        
        aux2.add(Notas.DO);
        aux2.add(Notas.DO);
        aux2.add(Notas.RE);
        aux2.add(Notas.SI);
        aux2.interpretar();
    }
}
