package Unidad9.Act2Mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo {
    @Override
    protected void amamantarCrias() {
        System.out.println("*Amamanta*");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("*Pone un huevo*");
    }
}
